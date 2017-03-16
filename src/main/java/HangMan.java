import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class HangMan {
  private String mWord;
  // private char mUserLetter;
  private List<Character> blanksArray = new ArrayList<Character>();

  public HangMan() {
    mWord = "potato";
  }

  public String getWord() {
    return mWord;
  }

  public List<Character> getWordToArray() {
    char[] charArray = mWord.toCharArray();
    List<Character> charList = new ArrayList<Character>();

    for (char letters : charArray) {
      charList.add(letters);
    }
    return charList;
  }

  public List<Character> makeBlanksArray() {
    for (Character letter : getWordToArray()) {
      blanksArray.add(new Character('-'));
    }
    return blanksArray;
  }

  public boolean wordContainsLetter(char userLetter) {
    if (getWordToArray().contains(userLetter)) {
      return true;
    } else {
      return false;
    }
  }

  public List<Character> replaceBlanksWithCorrectGuesses(char userLetter) {
    List<Character> myWord = getWordToArray();
    for (Integer i = 0; i < myWord.size(); i++) {
      if (myWord.get(i) == userLetter) {
        blanksArray.set(i, userLetter);
      }
    }
    return blanksArray;
  }

}
