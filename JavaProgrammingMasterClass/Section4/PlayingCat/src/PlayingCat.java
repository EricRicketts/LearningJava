public class PlayingCat {

    public static boolean isCatPlaying(boolean isSummer, int temperature) {
        boolean isPlaying = false;
        if (isSummer && temperature >=25 && temperature <= 45) {
            isPlaying = true;
        } else if (temperature >= 25 && temperature <= 35) {
            isPlaying = true;
        }
        return isPlaying;
    }
}
