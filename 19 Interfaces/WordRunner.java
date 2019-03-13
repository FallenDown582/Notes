//(c) A+ Computer Science
// www.apluscompsci.com

//comparable example one

import static java.lang.System.*;
<<<<<<< HEAD
import java.util.*;

public class WordRunner
{
 public static Word[] theMains;
 Word x = new Word("Pit");
 Word y = new Word("Chariot");
 Word z = new Word("Palutena");
 Word a = new Word("Incineroar");
 Word b = new Word("Mewtwo");
 Word c = new Word("Cloud");
 Word d = new Word("Ridley");
 //theMains = new Word[]{x, y, z, a, b, c, d};
 public static void main ( String[] args )
 {
  Word x = new Word("Pit");
  Word y = new Word("Chariot");
  Word z = new Word("Palutena");
  Word a = new Word("Incineroar");
  Word b = new Word("Mewtwo");
  Word c = new Word("Cloud");
  Word d = new Word("Ridley");
  //System.out.println( x.compareTo(y) );
  theMains = new Word[]{x, y, z, a, b, c, d};
  //make a list of Word
  //call Collections.sort() and sort the list
  //print the list
  ArrayList<Word> mains = new ArrayList<Word>();
  mains.add(x);
  mains.add(y);
  mains.add(z);
  mains.add(a);
  mains.add(b);
  mains.add(c);
  mains.add(d);
  
  Collections.sort(mains);
  out.print(mains);
=======
import static java.util.ArrayList;
import static java.util.Collections;

public class WordRunner
{
 public static void main ( String[] args )
 {
  Word x = new Word("cat");
  Word y = new Word("catcat");
  System.out.println( x.compareTo(y) );
  
  //make a list of Word
  List<Word> list = new ArrayList<Word>();
  
  //call Collections.sort() and sort the list
  //print the list
>>>>>>> upstream/master
  }
}