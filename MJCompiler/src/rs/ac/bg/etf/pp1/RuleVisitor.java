package rs.ac.bg.etf.pp1;

import org.apache.log4j.Logger;
import rs.ac.bg.etf.pp1.ast.*;

public class RuleVisitor extends VisitorAdaptor{

	int printCallCount = 0;
	int varDeclCount = 0;
	int returnCount = 0;
	Logger log = Logger.getLogger(getClass());


	@Override
	public void visit(VarDeclK1 vardecl){
		varDeclCount++;
	}
    
	
}
