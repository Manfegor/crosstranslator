
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package hu.iit.uni_miskolc.horvath23.Crosstranslator.parser;

import java.util.*;
import java.io.*;
import java_cup.runtime.*;
import java_cup.runtime.ComplexSymbolFactory.ComplexSymbol;
import hu.iit.uni_miskolc.horvath23.Crosstranslator.expressions.*;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\031\000\002\002\004\000\002\002\003\000\002\003" +
    "\004\000\002\003\002\000\002\005\006\000\002\006\003" +
    "\000\002\006\004\000\002\013\003\000\002\013\003\000" +
    "\002\013\003\000\002\015\005\000\002\011\011\000\002" +
    "\011\012\000\002\007\003\000\002\007\004\000\002\010" +
    "\003\000\002\010\003\000\002\010\003\000\002\010\003" +
    "\000\002\004\003\000\002\004\003\000\002\012\004\000" +
    "\002\012\005\000\002\012\003\000\002\012\004" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\057\000\006\002\ufffe\004\004\001\002\000\004\070" +
    "\012\001\002\000\006\002\ufffe\004\004\001\002\000\004" +
    "\002\010\001\002\000\004\002\000\001\002\000\004\002" +
    "\001\001\002\000\004\002\uffff\001\002\000\022\020\014" +
    "\021\023\022\024\023\020\055\027\061\016\062\026\063" +
    "\031\001\002\000\024\005\ufff9\020\ufff9\021\ufff9\022\ufff9" +
    "\023\ufff9\055\ufff9\061\ufff9\062\ufff9\063\ufff9\001\002\000" +
    "\004\006\ufff2\001\002\000\024\005\ufffa\020\ufffa\021\ufffa" +
    "\022\ufffa\023\ufffa\055\ufffa\061\ufffa\062\ufffa\063\ufffa\001" +
    "\002\000\016\020\uffee\021\uffee\022\uffee\023\uffee\055\uffee" +
    "\063\uffee\001\002\000\016\020\014\021\023\022\024\023" +
    "\020\055\053\063\044\001\002\000\004\006\uffef\001\002" +
    "\000\024\005\052\020\014\021\023\022\024\023\020\055" +
    "\027\061\016\062\026\063\031\001\002\000\026\005\ufff8" +
    "\020\ufff8\021\ufff8\022\ufff8\023\ufff8\040\050\055\ufff8\061" +
    "\ufff8\062\ufff8\063\ufff8\001\002\000\004\006\ufff1\001\002" +
    "\000\004\006\ufff0\001\002\000\004\006\047\001\002\000" +
    "\016\020\uffed\021\uffed\022\uffed\023\uffed\055\uffed\063\uffed" +
    "\001\002\000\004\070\032\001\002\000\024\005\ufffc\020" +
    "\ufffc\021\ufffc\022\ufffc\023\ufffc\055\ufffc\061\ufffc\062\ufffc" +
    "\063\ufffc\001\002\000\030\005\uffea\011\uffea\020\uffea\021" +
    "\uffea\022\uffea\023\uffea\040\uffea\055\uffea\061\uffea\062\uffea" +
    "\063\uffea\001\002\000\004\010\033\001\002\000\020\020" +
    "\014\021\023\022\024\023\020\061\016\062\026\063\031" +
    "\001\002\000\014\020\014\021\023\022\024\023\020\063" +
    "\044\001\002\000\022\011\ufff4\020\ufff4\021\ufff4\022\ufff4" +
    "\023\ufff4\061\ufff4\062\ufff4\063\ufff4\001\002\000\022\011" +
    "\040\020\014\021\023\022\024\023\020\061\016\062\026" +
    "\063\031\001\002\000\022\011\ufff3\020\ufff3\021\ufff3\022" +
    "\ufff3\023\ufff3\061\ufff3\062\ufff3\063\ufff3\001\002\000\022" +
    "\020\014\021\023\022\024\023\020\055\027\061\016\062" +
    "\026\063\031\001\002\000\024\005\043\020\014\021\023" +
    "\022\024\023\020\055\027\061\016\062\026\063\031\001" +
    "\002\000\024\005\ufffb\020\ufffb\021\ufffb\022\ufffb\023\ufffb" +
    "\055\ufffb\061\ufffb\062\ufffb\063\ufffb\001\002\000\024\005" +
    "\ufff6\020\ufff6\021\ufff6\022\ufff6\023\ufff6\055\ufff6\061\ufff6" +
    "\062\ufff6\063\ufff6\001\002\000\030\005\uffe9\011\uffe9\020" +
    "\uffe9\021\uffe9\022\uffe9\023\uffe9\040\uffe9\055\uffe9\061\uffe9" +
    "\062\uffe9\063\uffe9\001\002\000\004\006\046\001\002\000" +
    "\030\005\uffeb\011\uffeb\020\uffeb\021\uffeb\022\uffeb\023\uffeb" +
    "\040\uffeb\055\uffeb\061\uffeb\062\uffeb\063\uffeb\001\002\000" +
    "\030\005\uffec\011\uffec\020\uffec\021\uffec\022\uffec\023\uffec" +
    "\040\uffec\055\uffec\061\uffec\062\uffec\063\uffec\001\002\000" +
    "\020\020\014\021\023\022\024\023\020\061\016\062\026" +
    "\063\031\001\002\000\024\005\ufff7\020\ufff7\021\ufff7\022" +
    "\ufff7\023\ufff7\055\ufff7\061\ufff7\062\ufff7\063\ufff7\001\002" +
    "\000\006\002\ufffd\004\ufffd\001\002\000\004\070\054\001" +
    "\002\000\004\010\055\001\002\000\020\020\014\021\023" +
    "\022\024\023\020\061\016\062\026\063\031\001\002\000" +
    "\022\011\057\020\014\021\023\022\024\023\020\061\016" +
    "\062\026\063\031\001\002\000\020\020\014\021\023\022" +
    "\024\023\020\061\016\062\026\063\031\001\002\000\004" +
    "\005\061\001\002\000\024\005\ufff5\020\ufff5\021\ufff5\022" +
    "\ufff5\023\ufff5\055\ufff5\061\ufff5\062\ufff5\063\ufff5\001\002" +
    "" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\057\000\010\002\005\003\006\005\004\001\001\000" +
    "\002\001\001\000\006\003\010\005\004\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\020\004\016\006\020\010\024\011\012\012\021" +
    "\013\027\015\014\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\010\044" +
    "\001\001\000\002\001\001\000\016\004\016\010\024\011" +
    "\012\012\021\013\041\015\014\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\012\004\033\007\035\010" +
    "\024\012\034\001\001\000\004\010\044\001\001\000\002" +
    "\001\001\000\010\004\033\010\024\012\036\001\001\000" +
    "\002\001\001\000\020\004\016\006\040\010\024\011\012" +
    "\012\021\013\027\015\014\001\001\000\016\004\016\010" +
    "\024\011\012\012\021\013\041\015\014\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\010\004\033" +
    "\010\024\012\050\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\012\004\033" +
    "\007\055\010\024\012\034\001\001\000\010\004\033\010" +
    "\024\012\036\001\001\000\010\004\033\010\024\012\057" +
    "\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= program EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Program start_val = (Program)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // program ::= clslist 
            {
              Program RESULT =null;
		int clleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int clright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		List<ClassExpression> cl = (List<ClassExpression>)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new Program(cl); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("program",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // clslist ::= cls clslist 
            {
              List<ClassExpression> RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		ClassExpression c = (ClassExpression)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int clleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int clright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		List<ClassExpression> cl = (List<ClassExpression>)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 cl.add(c); RESULT = cl; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("clslist",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // clslist ::= 
            {
              List<ClassExpression> RESULT =null;
		 RESULT = new LinkedList<ClassExpression>(); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("clslist",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), (Symbol) RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // cls ::= CREATE IDENTIFIER block END 
            {
              ClassExpression RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		java.lang.String i = (java.lang.String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		 RESULT = new ClassExpression(i.toString()); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("cls",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // block ::= expr 
            {
              Block RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Expression e = (Expression)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 Block b = new Block(); b.addMember(e); RESULT = b; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("block",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // block ::= block expr 
            {
              Block RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Block b = (Block)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Expression e = (Expression)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 b.addMember(e); RESULT = b; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("block",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // expr ::= assignment 
            {
              Expression RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // expr ::= funct 
            {
              Expression RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // expr ::= variable 
            {
              Expression RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // assignment ::= variable EQ variable 
            {
              AssignmentExpression RESULT =null;
		int v1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int v1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		VarExpression v1 = (VarExpression)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int v2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int v2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		VarExpression v2 = (VarExpression)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new AssignmentExpression(v1,v2); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("assignment",11, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // funct ::= FUNCTION IDENTIFIER LPAREN identlist RPAREN block END 
            {
              FunctExpression RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)).right;
		java.lang.String i = (java.lang.String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-5)).value;
		int illeft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int ilright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		List<VarExpression> il = (List<VarExpression>)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Block b = (Block)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = new FunctExpression(i.toString(), il, b); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("funct",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // funct ::= modifier FUNCTION IDENTIFIER LPAREN identlist RPAREN variable END 
            {
              FunctExpression RESULT =null;
		int mleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-7)).left;
		int mright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-7)).right;
		ModifierType m = (ModifierType)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-7)).value;
		int ileft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)).right;
		java.lang.String i = (java.lang.String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-5)).value;
		int illeft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int ilright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		List<VarExpression> il = (List<VarExpression>)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int vleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int vright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		VarExpression v = (VarExpression)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 Block b = new Block(); b.addMember(v); FunctExpression f = new FunctExpression(i.toString(), il, b); f.setModifier(m); RESULT = f; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("funct",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-7)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // identlist ::= variable 
            {
              List<VarExpression> RESULT =null;
		int vleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int vright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		VarExpression v = (VarExpression)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 LinkedList<VarExpression> il = new LinkedList<VarExpression>(); il.add(v); RESULT = il; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("identlist",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // identlist ::= identlist variable 
            {
              List<VarExpression> RESULT =null;
		int illeft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int ilright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		List<VarExpression> il = (List<VarExpression>)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int vleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int vright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		VarExpression v = (VarExpression)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 il.add(v); RESULT = il; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("identlist",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // typident ::= INT 
            {
              VariableType RESULT =null;
		 RESULT = VariableType.INT; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("typident",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // typident ::= STRING 
            {
              VariableType RESULT =null;
		 RESULT = VariableType.STRING; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("typident",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // typident ::= DOUBLE 
            {
              VariableType RESULT =null;
		 RESULT = VariableType.DOUBLE; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("typident",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // typident ::= BOOLEAN 
            {
              VariableType RESULT =null;
		 RESULT = VariableType.BOOLEAN; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("typident",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // modifier ::= PUBLIC 
            {
              ModifierType RESULT =null;
		 RESULT = ModifierType.PUBLIC; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("modifier",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // modifier ::= PRIVATE 
            {
              ModifierType RESULT =null;
		 RESULT = ModifierType.PRIVATE; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("modifier",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // variable ::= typident VARIABLE 
            {
              VarExpression RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		VariableType t = (VariableType)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int vleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int vright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object v = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new VarExpression(v.toString(), ModifierType.PRIVATE, t); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("variable",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // variable ::= modifier typident VARIABLE 
            {
              VarExpression RESULT =null;
		int mleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int mright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		ModifierType m = (ModifierType)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int tleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		VariableType t = (VariableType)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int vleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int vright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object v = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new VarExpression(v.toString(), m, t); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("variable",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // variable ::= INTEGER_LITERAL 
            {
              VarExpression RESULT =null;
		int vleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int vright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		java.lang.Number v = (java.lang.Number)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new VarExpression(v.toString(), ModifierType.PRIVATE, VariableType.INT); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("variable",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // variable ::= modifier INTEGER_LITERAL 
            {
              VarExpression RESULT =null;
		int mleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int mright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		ModifierType m = (ModifierType)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int vleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int vright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		java.lang.Number v = (java.lang.Number)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new VarExpression(v.toString(), m, VariableType.INT); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("variable",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}

}
