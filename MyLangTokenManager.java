/* Generated By:JavaCC: Do not edit this line. MyLangTokenManager.java */
import java.io.*;
import java.util.ArrayList;

/** Token Manager. */
public class MyLangTokenManager implements MyLangConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x100L) != 0L)
            return 4;
         if ((active0 & 0x1dce06ee0000L) != 0L)
         {
            jjmatchedKind = 47;
            return 13;
         }
         return -1;
      case 1:
         if ((active0 & 0xe02880000L) != 0L)
            return 13;
         if ((active0 & 0x1dc004660000L) != 0L)
         {
            jjmatchedKind = 47;
            jjmatchedPos = 1;
            return 13;
         }
         return -1;
      case 2:
         if ((active0 & 0x9c004200000L) != 0L)
         {
            if (jjmatchedPos != 2)
            {
               jjmatchedKind = 47;
               jjmatchedPos = 2;
            }
            return 13;
         }
         if ((active0 & 0x140000460000L) != 0L)
            return 13;
         return -1;
      case 3:
         if ((active0 & 0x80000040000L) != 0L)
         {
            jjmatchedKind = 47;
            jjmatchedPos = 3;
            return 13;
         }
         if ((active0 & 0x1c004200000L) != 0L)
            return 13;
         return -1;
      case 4:
         if ((active0 & 0x80000000000L) != 0L)
         {
            jjmatchedKind = 47;
            jjmatchedPos = 4;
            return 13;
         }
         if ((active0 & 0x40000L) != 0L)
            return 13;
         return -1;
      case 5:
         if ((active0 & 0x80000000000L) != 0L)
         {
            jjmatchedKind = 47;
            jjmatchedPos = 5;
            return 13;
         }
         return -1;
      case 6:
         if ((active0 & 0x80000000000L) != 0L)
         {
            jjmatchedKind = 47;
            jjmatchedPos = 6;
            return 13;
         }
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 33:
         return jjStopAtPos(0, 24);
      case 40:
         return jjStopAtPos(0, 13);
      case 41:
         return jjStopAtPos(0, 14);
      case 42:
         return jjStopAtPos(0, 7);
      case 43:
         return jjStopAtPos(0, 5);
      case 45:
         jjmatchedKind = 6;
         return jjMoveStringLiteralDfa1_0(0x80000000L);
      case 46:
         return jjStopAtPos(0, 41);
      case 47:
         return jjStartNfaWithStates_0(0, 8, 4);
      case 58:
         return jjStopAtPos(0, 37);
      case 60:
         jjmatchedKind = 28;
         return jjMoveStringLiteralDfa1_0(0x20000000L);
      case 61:
         return jjStopAtPos(0, 20);
      case 62:
         jjmatchedKind = 27;
         return jjMoveStringLiteralDfa1_0(0x40000000L);
      case 63:
         return jjStopAtPos(0, 32);
      case 68:
         return jjMoveStringLiteralDfa1_0(0xe00000000L);
      case 77:
         return jjMoveStringLiteralDfa1_0(0x8000000000L);
      case 91:
         return jjStopAtPos(0, 15);
      case 93:
         return jjStopAtPos(0, 16);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x100000400000L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x80000000000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x4000000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x40000000000L);
      case 103:
         return jjMoveStringLiteralDfa1_0(0x4000000000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x2080000L);
      case 111:
         return jjMoveStringLiteralDfa1_0(0x860000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x10000000000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x200000L);
      default :
         return jjMoveNfa_0(1, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 61:
         if ((active0 & 0x20000000L) != 0L)
            return jjStopAtPos(1, 29);
         else if ((active0 & 0x40000000L) != 0L)
            return jjStopAtPos(1, 30);
         break;
      case 62:
         if ((active0 & 0x80000000L) != 0L)
            return jjStopAtPos(1, 31);
         break;
      case 65:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000000000L);
      case 67:
         if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(1, 34, 13);
         break;
      case 73:
         if ((active0 & 0x800000000L) != 0L)
            return jjStartNfaWithStates_0(1, 35, 13);
         break;
      case 77:
         if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(1, 33, 13);
         break;
      case 100:
         return jjMoveStringLiteralDfa2_0(active0, 0x100000000000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000000000L);
      case 102:
         if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(1, 25, 13);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x200000L);
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000000000L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000000L);
      case 110:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(1, 19, 13);
         return jjMoveStringLiteralDfa2_0(active0, 0x400000L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0xc0000000000L);
      case 114:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(1, 23, 13);
         break;
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x60000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 73:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000000000L);
      case 100:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(2, 22, 13);
         else if ((active0 & 0x100000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 44, 13);
         break;
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x200000L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000000000L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000000000L);
      case 114:
         if ((active0 & 0x40000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 42, 13);
         break;
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000000L);
      case 116:
         if ((active0 & 0x20000L) != 0L)
         {
            jjmatchedKind = 17;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x40000L);
      case 118:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000000000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 78:
         if ((active0 & 0x8000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 39, 13);
         break;
      case 101:
         if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(3, 26, 13);
         else if ((active0 & 0x4000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 38, 13);
         break;
      case 102:
         if ((active0 & 0x10000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 40, 13);
         break;
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x40000L);
      case 115:
         if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(3, 21, 13);
         break;
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x80000000000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x80000000000L);
      case 110:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(4, 18, 13);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x80000000000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 110:
         return jjMoveStringLiteralDfa7_0(active0, 0x80000000000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 115:
         if ((active0 & 0x80000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 43, 13);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 14;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 9)
                        kind = 9;
                     jjCheckNAdd(0);
                  }
                  else if (curChar == 34)
                     jjCheckNAddTwoStates(10, 11);
                  else if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 0:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 9)
                     kind = 9;
                  jjCheckNAdd(0);
                  break;
               case 4:
                  if (curChar == 47)
                     jjCheckNAddTwoStates(5, 7);
                  break;
               case 5:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(5, 7);
                  break;
               case 6:
                  if (curChar == 47 && kind > 45)
                     kind = 45;
                  break;
               case 7:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 8:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 9:
                  if (curChar == 34)
                     jjCheckNAddTwoStates(10, 11);
                  break;
               case 10:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(10, 11);
                  break;
               case 11:
                  if (curChar == 34 && kind > 46)
                     kind = 46;
                  break;
               case 13:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 47)
                     kind = 47;
                  jjstateSet[jjnewStateCnt++] = 13;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 47)
                        kind = 47;
                     jjCheckNAdd(13);
                  }
                  if ((0x100040L & l) != 0L)
                  {
                     if (kind > 9)
                        kind = 9;
                  }
                  else if (curChar == 69)
                     jjCheckNAdd(3);
                  break;
               case 2:
                  if (curChar == 69)
                     jjCheckNAdd(3);
                  break;
               case 3:
                  if ((0x7fffffeL & l) == 0L)
                     break;
                  if (kind > 36)
                     kind = 36;
                  jjCheckNAdd(3);
                  break;
               case 5:
                  jjAddStates(0, 1);
                  break;
               case 10:
                  jjAddStates(2, 3);
                  break;
               case 12:
               case 13:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 47)
                     kind = 47;
                  jjCheckNAdd(13);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 5:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(0, 1);
                  break;
               case 10:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(2, 3);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 14 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   5, 7, 10, 11, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, "\53", "\55", "\52", "\57", null, null, null, null, 
"\50", "\51", "\133", "\135", "\157\165\164", "\157\165\164\154\156", "\151\156", 
"\75", "\164\150\151\163", "\141\156\144", "\157\162", "\41", "\151\146", 
"\145\154\163\145", "\76", "\74", "\74\75", "\76\75", "\55\76", "\77", "\104\115", "\104\103", 
"\104\111", null, "\72", "\147\151\166\145", "\115\101\111\116", "\163\145\154\146", 
"\56", "\146\157\162", "\143\157\156\164\141\151\156\163", "\141\144\144", null, null, 
null, null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0xffffffffe3e1L, 
};
static final long[] jjtoSkip = {
   0x1eL, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[14];
static private final int[] jjstateSet = new int[28];
static protected char curChar;
/** Constructor. */
public MyLangTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public MyLangTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 14; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

}
