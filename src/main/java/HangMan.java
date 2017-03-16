import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class HangMan {
  private String mWord;
  private char mUserLetter;
  private List<Character> blanksArray = new ArrayList<Character>();

  public HangMan(String baseWord, char userLetter) {
    mWord = baseWord;
    mUserLetter = userLetter;
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

  public boolean wordContainsLetter() {
    if (getWordToArray().contains(mUserLetter)) {
      return true;
    } else {
      return false;
    }
  }

  public List<Character> replaceBlanksWithCorrectGuesses() {
    List<Character> myWord = getWordToArray();
    for (Integer i = 0; i < myWord.size(); i++) {
      if (myWord.get(i) == mUserLetter) {
        blanksArray.set(i, mUserLetter);
      }
    }
    return blanksArray;
  }

}
