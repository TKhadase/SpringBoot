package com.tushar.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.tushar.commonObjects.covidBO;

@Repository("covidDAO")
@Profile("dev")
public class CovidPatientDAOImpl implements iCovidPatientDAO {

	/*
	 * create table coviddata(patientid number(10,0) not null enable, pname
	 * varchar2(30), pcity varchar2(30), pfees FLOAT(126), pnoofdays number(10,0),
	 * phospitalname varchar2(30), CONSTRAINT "Patient_PK" PRIMARY KEY(patientid));
	 */

	private String sqlQuery = "select pname, pcity, pfees, pnoofdays, phospitalname from coviddata where phospitalname in";

	@Autowired
	DataSource ds;

	@Override
	public List<covidBO> FetchPatientDetails(String hospitals) throws Exception {
		List<covidBO> DaoListBO = null;
		try {
			Connection con = ds.getConnection();
			System.out.println("DS:"+ds.getClass());
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sqlQuery + hospitals + "order by phospitalname");

			DaoListBO = new ArrayList();
			covidBO bo = null;

			while (rs.next()) {
				bo = new covidBO();
				bo.setPname(rs.getString("pname"));
				bo.setPcity(rs.getString("pcity"));
				bo.setPfees(rs.getDouble("pfees"));
				bo.setPnoofdays(rs.getInt("pnoofdays"));
				bo.setPhospitalname(rs.getString("phospitalname"));
				DaoListBO.add(bo);
			}

		} catch (SQLException se) {
			se.printStackTrace();
			throw se;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

		return DaoListBO;
	}

}
