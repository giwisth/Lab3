package interfaces;

import enums.Emotion;
import enums.Feeling;

public interface Status {
    public void setFeeling(Feeling feeling);
    public void willSetFeeling(Feeling feeling);
    public Feeling getFeeling();
    public void setEmotion(Emotion emotion);
    public void willSetEmotion(Emotion emotion);
    public Emotion getEmotion();
}
