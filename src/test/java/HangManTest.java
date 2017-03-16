import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class HangManTest {

  @Test
  public void newHangman_instantiatesCorrectly_true(){
    HangMan testGame = new HangMan("potato", 'a');
    assertEquals(true, testGame instanceof HangMan);
  }

  @Test
  public void getWord_returnString_true(){
    HangMan testGame = new HangMan("potato", 'a');
    String gotWord = testGame.getWord();
    assertEquals(true, gotWord instanceof String);
  }

  // @Ignore
  // @Test
  // public void getWordToArray_returnCharArray_true(){
  //   HangMan testGame = new HangMan("potato", 'a');
  //   List<Character> charArray = testGame.getWordToArray();
  //   assertEquals(true, charArray instanceof List<Character>);
  // }

  @Test
  public void makeBlanksArray_returnArraySameLengthAsCharArray_true(){
    HangMan testGame = new HangMan("potato", 'a');
    List<Character> charArray = testGame.getWordToArray();
    List<Character> blanksArray = testGame.makeBlanksArray();
    assertEquals(true, charArray.size() == blanksArray.size());
  }


}
