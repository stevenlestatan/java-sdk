package com.global.api.terminals.ingenico.variables;

public class INGENICO_REQ_CMD {
	public final String AUTHCODE = "AUTHCODE=%s;";
	public final String CASHBACK = "CASHB=%s;";
	
	public final String CANCEL = "CMD=CANCEL;";
	public final String DUPLICATE = "CMD=DUPLIC;";
	public final String REVERSE = "CMD=REVERSE;";
	public final String REVERSE_WITH_ID = "CMD=REV%s;";
	public final String TABLE_WITH_ID = "CMD=ID%s;";
	public final String CALL_TMS = "CMD=CALLTMS;";
	public final String LOGON = "CMD=LOGON;";
	public final String RESET = "CMD=RESET;";
	public final String STATE = "CMD=STATE;";
	public final String PID = "CMD=PID;";
	
	public final String REPORT = "0100000001100826EXT0100000A010B010CMD=%s;";
	public final String RECEIPT = "0100000001100826EXT0100000A010B010CMD=%s;";
	public final String REQUEST_MESSAGE = "0100000001100826EXT0100000A010B010";
	public final String DEFAULT_CURRENCY = "826";
}
