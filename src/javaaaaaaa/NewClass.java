/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaaaaaaa;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

/**
 *
 * @author hp
 */
public class NewClass {
    VoiceManager freettsVM;
    Voice freettsVoice;
    public NewClass(String words) {
        System.setProperty("mbrola.base", "C:/JavaLIB/mbrola/");
        freettsVM = VoiceManager.getInstance();
        freettsVoice = freettsVM.getVoice("mbrola_us1");
        freettsVoice.allocate();
        sayWords(words);
    }
    public void sayWords(String words) {
        freettsVoice.speak(words);
    }
    public static void main(String [] args) {
        new NewClass("Hello there! Now M BROLA and Free T T S work together!");
    }
}
