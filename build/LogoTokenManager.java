/* LogoTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. LogoTokenManager.java */
import java.lang.*;
import java.io.*;
import java.util.*;

/** Token Manager. */
@SuppressWarnings("unused")public class LogoTokenManager implements LogoConstants {

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0){
      debugStream.println("   No more string literal token matches are possible.");
   switch (pos)
   {
      case 0:
         if ((active0 & 0xfffffc0000L) != 0L)
         {
            jjmatchedKind = 43;
            return 4;
         }
         return -1;
      case 1:
         if ((active0 & 0x39ff080000L) != 0L)
            return 4;
         if ((active0 & 0xc600f40000L) != 0L)
         {
            if (jjmatchedPos != 1)
            {
               jjmatchedKind = 43;
               jjmatchedPos = 1;
            }
            return 4;
         }
         return -1;
      case 2:
         if ((active0 & 0x8000440000L) != 0L)
            return 4;
         if ((active0 & 0x5600b00000L) != 0L)
         {
            jjmatchedKind = 43;
            jjmatchedPos = 2;
            return 4;
         }
         return -1;
      case 3:
         if ((active0 & 0x4200100000L) != 0L)
            return 4;
         if ((active0 & 0x1400a00000L) != 0L)
         {
            jjmatchedKind = 43;
            jjmatchedPos = 3;
            return 4;
         }
         return -1;
      case 4:
         if ((active0 & 0x200000L) != 0L)
            return 4;
         if ((active0 & 0x1400800000L) != 0L)
         {
            jjmatchedKind = 43;
            jjmatchedPos = 4;
            return 4;
         }
         return -1;
      case 5:
         if ((active0 & 0x800000L) != 0L)
         {
            jjmatchedKind = 43;
            jjmatchedPos = 5;
            return 4;
         }
         if ((active0 & 0x1400000000L) != 0L)
            return 4;
         return -1;
      case 6:
         if ((active0 & 0x800000L) != 0L)
         {
            jjmatchedKind = 43;
            jjmatchedPos = 6;
            return 4;
         }
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0){
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   debugStream.println("   No more string literal token matches are possible.");
   debugStream.println("   Currently matched the first " + (jjmatchedPos + 1) + " characters as a " + tokenImage[jjmatchedKind] + " token.");
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 33:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 40:
         return jjStopAtPos(0, 7);
      case 41:
         return jjStopAtPos(0, 8);
      case 42:
         return jjStopAtPos(0, 5);
      case 43:
         return jjStopAtPos(0, 3);
      case 45:
         return jjStopAtPos(0, 4);
      case 47:
         return jjStopAtPos(0, 6);
      case 60:
         jjmatchedKind = 14;
         return jjMoveStringLiteralDfa1_0(0x10000L);
      case 61:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 62:
         jjmatchedKind = 15;
         return jjMoveStringLiteralDfa1_0(0x20000L);
      case 65:
         return jjMoveStringLiteralDfa1_0(0x40000L);
      case 66:
         return jjMoveStringLiteralDfa1_0(0x10000000L);
      case 67:
         return jjMoveStringLiteralDfa1_0(0x1000000L);
      case 69:
         return jjMoveStringLiteralDfa1_0(0x8000000000L);
      case 70:
         return jjMoveStringLiteralDfa1_0(0x8200000L);
      case 72:
         return jjMoveStringLiteralDfa1_0(0x80000000L);
      case 73:
         return jjMoveStringLiteralDfa1_0(0x1800000000L);
      case 76:
         return jjMoveStringLiteralDfa1_0(0x4020000000L);
      case 78:
         return jjMoveStringLiteralDfa1_0(0x400000L);
      case 79:
         return jjMoveStringLiteralDfa1_0(0x80000L);
      case 80:
         return jjMoveStringLiteralDfa1_0(0x6000000L);
      case 82:
         return jjMoveStringLiteralDfa1_0(0x440800000L);
      case 83:
         return jjMoveStringLiteralDfa1_0(0x100000000L);
      case 84:
         return jjMoveStringLiteralDfa1_0(0x2000100000L);
      case 87:
         return jjMoveStringLiteralDfa1_0(0x200000000L);
      case 91:
         return jjStopAtPos(0, 10);
      case 93:
         return jjStopAtPos(0, 11);
      default :
      debugStream.println("   No string literal matches possible.");
         return jjMoveNfa_0(0, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0){
   if (jjmatchedKind != 0 && jjmatchedKind != 0x7fffffff)
      debugStream.println("   Currently matched the first " + (jjmatchedPos + 1) + " characters as a " + tokenImage[jjmatchedKind] + " token.");
   debugStream.println("   Possible string literal matches : { "
 +
         jjKindsForBitVector(0, active0)  + " } ");
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      if (jjmatchedKind != 0 && jjmatchedKind != 0x7fffffff)
         debugStream.println("   Currently matched the first " + (jjmatchedPos + 1) + " characters as a " + tokenImage[jjmatchedKind] + " token.");
      return 1;
   }
   debugStream.println("Current character : " + TokenMgrError.addEscapes(String.valueOf(curChar)) + " (" + (int)curChar + ") at line " + input_stream.getEndLine() + " column " + input_stream.getEndColumn());
   switch(curChar)
   {
      case 61:
         if ((active0 & 0x1000L) != 0L)
            return jjStopAtPos(1, 12);
         else if ((active0 & 0x2000L) != 0L)
            return jjStopAtPos(1, 13);
         else if ((active0 & 0x10000L) != 0L)
            return jjStopAtPos(1, 16);
         else if ((active0 & 0x20000L) != 0L)
            return jjStopAtPos(1, 17);
         break;
      case 65:
         return jjMoveStringLiteralDfa2_0(active0, 0x200200000L);
      case 68:
         if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(1, 25, 4);
         else if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(1, 27, 4);
         break;
      case 69:
         return jjMoveStringLiteralDfa2_0(active0, 0x400800000L);
      case 70:
         if ((active0 & 0x800000000L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x1000000000L);
      case 75:
         if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(1, 28, 4);
         break;
      case 78:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000040000L);
      case 79:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 37, 4);
         return jjMoveStringLiteralDfa2_0(active0, 0x4000400000L);
      case 82:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(1, 19, 4);
         return jjMoveStringLiteralDfa2_0(active0, 0x100000L);
      case 83:
         if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(1, 24, 4);
         break;
      case 84:
         if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(1, 29, 4);
         else if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(1, 30, 4);
         else if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(1, 31, 4);
         else if ((active0 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(1, 32, 4);
         break;
      case 85:
         if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(1, 26, 4);
         break;
      default :
      debugStream.println("   No string literal matches possible.");
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   if (jjmatchedKind != 0 && jjmatchedKind != 0x7fffffff)
      debugStream.println("   Currently matched the first " + (jjmatchedPos + 1) + " characters as a " + tokenImage[jjmatchedKind] + " token.");
   debugStream.println("   Possible string literal matches : { "
 +
         jjKindsForBitVector(0, active0)  + " } ");
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      if (jjmatchedKind != 0 && jjmatchedKind != 0x7fffffff)
         debugStream.println("   Currently matched the first " + (jjmatchedPos + 1) + " characters as a " + tokenImage[jjmatchedKind] + " token.");
      return 2;
   }
   debugStream.println("Current character : " + TokenMgrError.addEscapes(String.valueOf(curChar)) + " (" + (int)curChar + ") at line " + input_stream.getEndLine() + " column " + input_stream.getEndColumn());
   switch(curChar)
   {
      case 68:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(2, 18, 4);
         else if ((active0 & 0x8000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 39, 4);
         break;
      case 69:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000000000L);
      case 71:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000000000L);
      case 73:
         return jjMoveStringLiteralDfa3_0(active0, 0x200000000L);
      case 76:
         return jjMoveStringLiteralDfa3_0(active0, 0x200000L);
      case 80:
         return jjMoveStringLiteralDfa3_0(active0, 0x400800000L);
      case 84:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(2, 22, 4);
         break;
      case 85:
         return jjMoveStringLiteralDfa3_0(active0, 0x100000L);
      default :
      debugStream.println("   No string literal matches possible.");
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   if (jjmatchedKind != 0 && jjmatchedKind != 0x7fffffff)
      debugStream.println("   Currently matched the first " + (jjmatchedPos + 1) + " characters as a " + tokenImage[jjmatchedKind] + " token.");
   debugStream.println("   Possible string literal matches : { "
 +
         jjKindsForBitVector(0, active0)  + " } ");
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      if (jjmatchedKind != 0 && jjmatchedKind != 0x7fffffff)
         debugStream.println("   Currently matched the first " + (jjmatchedPos + 1) + " characters as a " + tokenImage[jjmatchedKind] + " token.");
      return 3;
   }
   debugStream.println("Current character : " + TokenMgrError.addEscapes(String.valueOf(curChar)) + " (" + (int)curChar + ") at line " + input_stream.getEndLine() + " column " + input_stream.getEndColumn());
   switch(curChar)
   {
      case 67:
         return jjMoveStringLiteralDfa4_0(active0, 0x800000L);
      case 69:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(3, 20, 4);
         return jjMoveStringLiteralDfa4_0(active0, 0x400000000L);
      case 76:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000000000L);
      case 79:
         if ((active0 & 0x4000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 38, 4);
         break;
      case 83:
         return jjMoveStringLiteralDfa4_0(active0, 0x200000L);
      case 84:
         if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(3, 33, 4);
         break;
      default :
      debugStream.println("   No string literal matches possible.");
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   if (jjmatchedKind != 0 && jjmatchedKind != 0x7fffffff)
      debugStream.println("   Currently matched the first " + (jjmatchedPos + 1) + " characters as a " + tokenImage[jjmatchedKind] + " token.");
   debugStream.println("   Possible string literal matches : { "
 +
         jjKindsForBitVector(0, active0)  + " } ");
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      if (jjmatchedKind != 0 && jjmatchedKind != 0x7fffffff)
         debugStream.println("   Currently matched the first " + (jjmatchedPos + 1) + " characters as a " + tokenImage[jjmatchedKind] + " token.");
      return 4;
   }
   debugStream.println("Current character : " + TokenMgrError.addEscapes(String.valueOf(curChar)) + " (" + (int)curChar + ") at line " + input_stream.getEndLine() + " column " + input_stream.getEndColumn());
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa5_0(active0, 0x400000000L);
      case 69:
         if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(4, 21, 4);
         break;
      case 79:
         return jjMoveStringLiteralDfa5_0(active0, 0x800000L);
      case 83:
         return jjMoveStringLiteralDfa5_0(active0, 0x1000000000L);
      default :
      debugStream.println("   No string literal matches possible.");
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   if (jjmatchedKind != 0 && jjmatchedKind != 0x7fffffff)
      debugStream.println("   Currently matched the first " + (jjmatchedPos + 1) + " characters as a " + tokenImage[jjmatchedKind] + " token.");
   debugStream.println("   Possible string literal matches : { "
 +
         jjKindsForBitVector(0, active0)  + " } ");
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      if (jjmatchedKind != 0 && jjmatchedKind != 0x7fffffff)
         debugStream.println("   Currently matched the first " + (jjmatchedPos + 1) + " characters as a " + tokenImage[jjmatchedKind] + " token.");
      return 5;
   }
   debugStream.println("Current character : " + TokenMgrError.addEscapes(String.valueOf(curChar)) + " (" + (int)curChar + ") at line " + input_stream.getEndLine() + " column " + input_stream.getEndColumn());
   switch(curChar)
   {
      case 69:
         if ((active0 & 0x1000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 36, 4);
         break;
      case 84:
         if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(5, 34, 4);
         break;
      case 85:
         return jjMoveStringLiteralDfa6_0(active0, 0x800000L);
      default :
      debugStream.println("   No string literal matches possible.");
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   if (jjmatchedKind != 0 && jjmatchedKind != 0x7fffffff)
      debugStream.println("   Currently matched the first " + (jjmatchedPos + 1) + " characters as a " + tokenImage[jjmatchedKind] + " token.");
   debugStream.println("   Possible string literal matches : { "
 +
         jjKindsForBitVector(0, active0)  + " } ");
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      if (jjmatchedKind != 0 && jjmatchedKind != 0x7fffffff)
         debugStream.println("   Currently matched the first " + (jjmatchedPos + 1) + " characters as a " + tokenImage[jjmatchedKind] + " token.");
      return 6;
   }
   debugStream.println("Current character : " + TokenMgrError.addEscapes(String.valueOf(curChar)) + " (" + (int)curChar + ") at line " + input_stream.getEndLine() + " column " + input_stream.getEndColumn());
   switch(curChar)
   {
      case 78:
         return jjMoveStringLiteralDfa7_0(active0, 0x800000L);
      default :
      debugStream.println("   No string literal matches possible.");
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   if (jjmatchedKind != 0 && jjmatchedKind != 0x7fffffff)
      debugStream.println("   Currently matched the first " + (jjmatchedPos + 1) + " characters as a " + tokenImage[jjmatchedKind] + " token.");
   debugStream.println("   Possible string literal matches : { "
 +
         jjKindsForBitVector(0, active0)  + " } ");
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      if (jjmatchedKind != 0 && jjmatchedKind != 0x7fffffff)
         debugStream.println("   Currently matched the first " + (jjmatchedPos + 1) + " characters as a " + tokenImage[jjmatchedKind] + " token.");
      return 7;
   }
   debugStream.println("Current character : " + TokenMgrError.addEscapes(String.valueOf(curChar)) + " (" + (int)curChar + ") at line " + input_stream.getEndLine() + " column " + input_stream.getEndColumn());
   switch(curChar)
   {
      case 84:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(7, 23, 4);
         break;
      default :
      debugStream.println("   No string literal matches possible.");
         break;
   }
   return jjStartNfa_0(6, active0);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   debugStream.println("   No more string literal token matches are possible.");
   debugStream.println("   Currently matched the first " + (jjmatchedPos + 1) + " characters as a " + tokenImage[jjmatchedKind] + " token.");
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   debugStream.println("Current character : " + TokenMgrError.addEscapes(String.valueOf(curChar)) + " (" + (int)curChar + ") at line " + input_stream.getEndLine() + " column " + input_stream.getEndColumn());
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 13;
   int i = 1;
   jjstateSet[0] = startState;
      debugStream.println("   Starting NFA to match one of : " + jjKindsForStateVector(curLexState, jjstateSet, 0, 1));
      debugStream.println("Current character : " + TokenMgrError.addEscapes(String.valueOf(curChar)) + " (" + (int)curChar + ") at line " + input_stream.getEndLine() + " column " + input_stream.getEndColumn());
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
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 42)
                        kind = 42;
                     { jjCheckNAddStates(0, 2); }
                  }
                  else if ((0x100002600L & l) != 0L)
                  {
                     if (kind > 1)
                        kind = 1;
                  }
                  else if (curChar == 58)
                     jjstateSet[jjnewStateCnt++] = 6;
                  else if (curChar == 35)
                  {
                     if (kind > 2)
                        kind = 2;
                     { jjCheckNAdd(2); }
                  }
                  break;
               case 1:
                  if (curChar != 35)
                     break;
                  if (kind > 2)
                     kind = 2;
                  { jjCheckNAdd(2); }
                  break;
               case 2:
                  if ((0xffffffffffffdbffL & l) == 0L)
                     break;
                  if (kind > 2)
                     kind = 2;
                  { jjCheckNAdd(2); }
                  break;
               case 4:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 43)
                     kind = 43;
                  jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 5:
                  if (curChar == 58)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 7:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 44)
                     kind = 44;
                  jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 8:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 42)
                     kind = 42;
                  { jjCheckNAddStates(0, 2); }
                  break;
               case 9:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 42)
                     kind = 42;
                  { jjCheckNAdd(9); }
                  break;
               case 10:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(10, 11); }
                  break;
               case 11:
                  if (curChar == 46)
                     { jjCheckNAdd(12); }
                  break;
               case 12:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 42)
                     kind = 42;
                  { jjCheckNAdd(12); }
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
               case 0:
               case 4:
                  if ((0x7fffffeL & l) == 0L)
                     break;
                  if (kind > 43)
                     kind = 43;
                  { jjCheckNAdd(4); }
                  break;
               case 2:
                  if (kind > 2)
                     kind = 2;
                  jjstateSet[jjnewStateCnt++] = 2;
                  break;
               case 6:
               case 7:
                  if ((0x7fffffeL & l) == 0L)
                     break;
                  if (kind > 44)
                     kind = 44;
                  { jjCheckNAdd(7); }
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
               case 2:
                  if ((jjbitVec0[i2] & l2) == 0L)
                     break;
                  if (kind > 2)
                     kind = 2;
                  jjstateSet[jjnewStateCnt++] = 2;
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
      if (jjmatchedKind != 0 && jjmatchedKind != 0x7fffffff)
         debugStream.println("   Currently matched the first " + (jjmatchedPos + 1) + " characters as a " + tokenImage[jjmatchedKind] + " token.");
      if ((i = jjnewStateCnt) == (startsAt = 13 - (jjnewStateCnt = startsAt)))
         return curPos;
      debugStream.println("   Possible kinds of longer matches : " + jjKindsForStateVector(curLexState, jjstateSet, startsAt, i));
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
      debugStream.println("Current character : " + TokenMgrError.addEscapes(String.valueOf(curChar)) + " (" + (int)curChar + ") at line " + input_stream.getEndLine() + " column " + input_stream.getEndColumn());
   }
}
static final int[] jjnextStates = {
   9, 10, 11, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, "\53", "\55", "\52", "\57", "\50", "\51", null, "\133", 
"\135", "\75\75", "\41\75", "\74", "\76", "\74\75", "\76\75", "\101\116\104", 
"\117\122", "\124\122\125\105", "\106\101\114\123\105", "\116\117\124", 
"\122\105\120\103\117\125\116\124", "\103\123", "\120\104", "\120\125", "\106\104", "\102\113", "\114\124", 
"\122\124", "\110\124", "\123\124", "\127\101\111\124", "\122\105\120\105\101\124", 
"\111\106", "\111\106\105\114\123\105", "\124\117", "\114\117\107\117", "\105\116\104", 
null, null, null, null, null, };
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
   catch(Exception e)
   {
      debugStream.println("Returning the <EOF> token.\n");
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
      debugStream.println("Current character : " + TokenMgrError.addEscapes(String.valueOf(curChar)) + " (" + (int)curChar + ") at line " + input_stream.getEndLine() + " column " + input_stream.getEndColumn());
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
      {
         debugStream.println("   Putting back " + (curPos - jjmatchedPos - 1) + " characters into the input stream.");
         input_stream.backup(curPos - jjmatchedPos - 1);
      }
    debugStream.println("****** FOUND A " + tokenImage[jjmatchedKind] + " MATCH (" + TokenMgrError.addEscapes(new String(input_stream.GetSuffix(jjmatchedPos + 1))) + ") ******\n");
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

protected static final int[][][] statesForState = {
 {
   { 0, 1, 3, 5, 8, },
   { 0, 1, 3, 5, 8, },
   { 2 },
   { 0, 1, 3, 5, 8, },
   { 4 },
   { 0, 1, 3, 5, 8, },
   { 6 },
   { 7 },
   { 0, 1, 3, 5, 8, },
   { 9 },
   { 10 },
   { 11 },
   { 12 },
},

};
protected static final int[][] kindForState = {
{ 
  1, 
  2, 
  2, 
  43, 
  43, 
  44, 
  44, 
  44, 
  42, 
  42, 
  42, 
  42, 
  42, }
};
  static int kindCnt = 0;
  protected static final String jjKindsForBitVector(int i, long vec)
  {
    String retVal = "";
    if (i == 0)
       kindCnt = 0;
    for (int j = 0; j < 64; j++)
    {
       if ((vec & (1L << j)) != 0L)
       {
          if (kindCnt++ > 0)
             retVal += ", ";
          if (kindCnt % 5 == 0)
             retVal += "\n     ";
          retVal += tokenImage[i * 64 + j];
       }
    }
    return retVal;
  }


  protected static final String jjKindsForStateVector(int lexState, int[] vec, int start, int end)
  {
    boolean[] kindDone = new boolean[45];
    String retVal = "";
    int cnt = 0;
    for (int i = start; i < end; i++)
    {
     if (vec[i] == -1)
       continue;
     int[] stateSet = statesForState[curLexState][vec[i]];
     for (int j = 0; j < stateSet.length; j++)
     {
       int state = stateSet[j];
       if (!kindDone[kindForState[lexState][state]])
       {
          kindDone[kindForState[lexState][state]] = true;
          if (cnt++ > 0)
             retVal += ", ";
          if (cnt % 5 == 0)
             retVal += "\n     ";
          retVal += tokenImage[kindForState[lexState][state]];
       }
     }
    }
    if (cnt == 0)
       return "{  }";
    else
       return "{ " + retVal + " }";
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

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

    /** Constructor. */
    public LogoTokenManager(SimpleCharStream stream){

      if (input_stream != null)
        throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);

    input_stream = stream;
  }

  /** Constructor. */
  public LogoTokenManager (SimpleCharStream stream, int lexState){
    ReInit(stream);
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
    for (i = 13; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  static public void ReInit( SimpleCharStream stream, int lexState)
  {
  
    ReInit( stream);
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

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x1cfffffffdf9L, 
};
static final long[] jjtoSkip = {
   0x6L, 
};
    static protected SimpleCharStream  input_stream;

    static private final int[] jjrounds = new int[13];
    static private final int[] jjstateSet = new int[2 * 13];

    
    static protected int curChar;
}