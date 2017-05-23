package org.krypto.dataaccess;

public class SECURITY_ROLE {
	
	protected Number ID;
	protected String ROLE_NAME;
	protected String NAME;
	protected String LAST_NAME;
	protected Number DOCUMENT; 
	protected String EMAIL;
	protected String DESCRIPTION;
	protected Byte ACTIVE;
	
	public SECURITY_ROLE()
	{
		
	}
		
	public SECURITY_ROLE(Number iD, String rOLE_NAME, String nAME, String lAST_NAME, Number dOCUMENT, String eMAIL,
			String dESCRIPTION, Byte aCTIVE) {
		super();
		ID = iD;
		ROLE_NAME = rOLE_NAME;
		NAME = nAME;
		LAST_NAME = lAST_NAME;
		DOCUMENT = dOCUMENT;
		EMAIL = eMAIL;
		DESCRIPTION = dESCRIPTION;
		ACTIVE = aCTIVE;
	}
	
	public Number getID() {
		return ID;
	}
	public void setID(Number iD) {
		ID = iD;
	}
	public String getROLE_NAME() {
		return ROLE_NAME;
	}
	public void setROLE_NAME(String rOLE_NAME) {
		ROLE_NAME = rOLE_NAME;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getLAST_NAME() {
		return LAST_NAME;
	}
	public void setLAST_NAME(String lAST_NAME) {
		LAST_NAME = lAST_NAME;
	}
	public Number getDOCUMENT() {
		return DOCUMENT;
	}
	public void setDOCUMENT(Number dOCUMENT) {
		DOCUMENT = dOCUMENT;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	public String getDESCRIPTION() {
		return DESCRIPTION;
	}
	public void setDESCRIPTION(String dESCRIPTION) {
		DESCRIPTION = dESCRIPTION;
	}
	public Byte getACTIVE() {
		return ACTIVE;
	}
	public void setACTIVE(Byte aCTIVE) {
		ACTIVE = aCTIVE;
	}
	
		
	@Override
	public String toString(){
		return "SECURITY_ROLE [ID: " + ID +"\n" + "ROLE_NAME: " + ROLE_NAME + "\n" + 
				"NAME: " + NAME + "\n" + "LAST_NAME: " + LAST_NAME + "\n" +
				"DOCUMENT: " + DOCUMENT + "\n" + "EMAIL: " + EMAIL + "\n" +
				"DESCRIPTION: " + DESCRIPTION +"\n" + "ACTIVE: " + ACTIVE + "]" ; 
				}
	
}
