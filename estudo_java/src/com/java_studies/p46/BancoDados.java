package com.java_studies.p46;

public interface BancoDados extends SqlDDL, SqlDCL, SqlDML{
	
	void openConnection();
	void closeConnection();
	
}
