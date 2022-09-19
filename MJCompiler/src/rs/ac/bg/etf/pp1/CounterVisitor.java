package rs.ac.bg.etf.pp1;

import rs.ac.bg.etf.pp1.ast.FormalParamDeclK1;
import rs.ac.bg.etf.pp1.ast.FormalParamDeclK2;
import rs.ac.bg.etf.pp1.ast.VarIdentBrackets;
import rs.ac.bg.etf.pp1.ast.VarIdentNoBrackets;
import rs.ac.bg.etf.pp1.ast.VisitorAdaptor;

public class CounterVisitor extends VisitorAdaptor {
	
	protected int count = 0;
	public int getCount() {
		return count;
	}
	
	public static class FormParamCounter extends CounterVisitor{
		
		@Override
		public void visit(FormalParamDeclK1 param) {
			count++;
		}
		
		@Override
		public void visit(FormalParamDeclK2 param) {
			count++;
		}
	}
	
	public static class VarCounter extends CounterVisitor{
		
		@Override
		public void visit(VarIdentBrackets var) {
			count++;
		}
		
		@Override
		public void visit(VarIdentNoBrackets var) {
			count++;
		}
	}
}
