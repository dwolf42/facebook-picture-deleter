import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.InputEvent;

public class FbPicDelGoBrrr {
    private int _picsToDelete = 0; // Set this to the amount of pictures in your profile to be deleted
    private Robot _picDel;

    public FbPicDelGoBrrr() throws AWTException {
        _picDel = new Robot();

    }

    public void ripCord() {
        System.out.println("VRROOOMMM !");
        for (int i = 0; i <= _picsToDelete; i++) {
            /*
            ~ Step 1 ~
            First location:
            In photos / Your photos
            Set the coordinates where the pencil icon is
            */
            _picDel.mouseMove(000, 000); // moves mouse to location
            _picDel.mousePress(InputEvent.getMaskForButton(1)); // holds down lmb
            _picDel.delay(500); // wait before lmb is released
            _picDel.mouseRelease(InputEvent.getMaskForButton(1)); // release lmb

            /*
            ~ Step 2 ~
            Second location:
            In the upcoming menu
            Set the coordinates where the trashcan or delete icon is located
            */
            _picDel.mouseMove(000, 000); // moves mouse to location
            _picDel.delay(2091); // delay to avoid being recognized as a script
            _picDel.mousePress(InputEvent.getMaskForButton(1)); // holds down lmb
            _picDel.delay(2108); // wait before lmb is released (avoid script recognition)
            _picDel.mouseRelease(InputEvent.getMaskForButton(1)); // release lmb

            /*
            ~ Step 3 ~
            Third location:
            Little popup in middle of screen appears
            Set coordinates where the 'delete' button is located
             */
            _picDel.mouseMove(000, 000); // moves mouse to location
            _picDel.delay(1305); // delay to avoid being recognized as a script
            _picDel.mousePress(InputEvent.getMaskForButton(1)); // holds down lmb
            _picDel.delay(1018); // delay to avoid being recognized as a script
            _picDel.mouseRelease(InputEvent.getMaskForButton(1)); // release lmb

            /*
            ~ Step 4 ~
            Processing delay
            This is required, as the process of deleting a picture takes a couple of seconds.
             */
            _picDel.delay(6853); // if set too low, following loops go to funky locations

            /*
            ~ Step 5 ~
            Safety Repositioning
            I'm not a web dev, but to me, it appears in step 3 that the popup seem to mess with the coordinates.
            As a result, the mouse was not relocated properly to the coordinates in step 1 after the popup disappeared.
            However, after this repositioning, the mouse could be placed at the coordinates of step 1 flawlessly
            in order to start a new cycle.
             */
            _picDel.mouseMove(000, 000);
        }
    }
}