/* Generated By:JavaCC: Do not edit this line. SimpleParserConstants.java */
package it.unimi.di.big.mg4j.query.parser;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface SimpleParserConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int AND = 5;
  /** RegularExpression Id. */
  int OAND = 6;
  /** RegularExpression Id. */
  int OR = 7;
  /** RegularExpression Id. */
  int NOT = 8;
  /** RegularExpression Id. */
  int ALIGN = 9;
  /** RegularExpression Id. */
  int OPEN_PAREN = 10;
  /** RegularExpression Id. */
  int CLOSE_PAREN = 11;
  /** RegularExpression Id. */
  int OPEN_RANGE = 12;
  /** RegularExpression Id. */
  int CLOSE_RANGE = 13;
  /** RegularExpression Id. */
  int OPEN_WEIGHT = 14;
  /** RegularExpression Id. */
  int CLOSE_WEIGHT = 15;
  /** RegularExpression Id. */
  int OPEN_REMAP = 16;
  /** RegularExpression Id. */
  int CLOSE_REMAP = 17;
  /** RegularExpression Id. */
  int RIGHTARROW = 18;
  /** RegularExpression Id. */
  int LEFTARROW = 19;
  /** RegularExpression Id. */
  int OPEN_ENLARGE = 20;
  /** RegularExpression Id. */
  int CLOSE_ENLARGE = 21;
  /** RegularExpression Id. */
  int ANNO = 22;
  /** RegularExpression Id. */
  int QUOTE = 23;
  /** RegularExpression Id. */
  int COLON = 24;
  /** RegularExpression Id. */
  int SEMICOLON = 25;
  /** RegularExpression Id. */
  int TILDA = 26;
  /** RegularExpression Id. */
  int PLUS = 27;
  /** RegularExpression Id. */
  int MINUS = 28;
  /** RegularExpression Id. */
  int SHARP = 29;
  /** RegularExpression Id. */
  int TRUE = 30;
  /** RegularExpression Id. */
  int FALSE = 31;
  /** RegularExpression Id. */
  int PREFIX = 32;
  /** RegularExpression Id. */
  int HOLE = 33;
  /** RegularExpression Id. */
  int INTERVAL_SEPARATOR = 34;
  /** RegularExpression Id. */
  int WORD = 35;

  /** Lexical state. */
  int DEFAULT = 0;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "<AND>",
    "\"<\"",
    "<OR>",
    "<NOT>",
    "\"^\"",
    "\"(\"",
    "\")\"",
    "\"[\"",
    "\"]\"",
    "\"{\"",
    "\"}\"",
    "\"{{\"",
    "\"}}\"",
    "<RIGHTARROW>",
    "<LEFTARROW>",
    "\"[[\"",
    "\"]]\"",
    "\"//\"",
    "\"\\\"\"",
    "\":\"",
    "\";\"",
    "\"~\"",
    "\"+\"",
    "\"-\"",
    "\"#\"",
    "<TRUE>",
    "<FALSE>",
    "\"*\"",
    "\"$\"",
    "\"..\"",
    "<WORD>",
  };

}
