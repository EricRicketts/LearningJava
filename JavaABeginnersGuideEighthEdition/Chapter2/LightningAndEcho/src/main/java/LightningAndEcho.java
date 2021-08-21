public class LightningAndEcho {
    final public static double speedOfSoundFPS = 1100.0;

    public static double lightningDistance(double seconds) {
        return seconds * speedOfSoundFPS;
    }

    public static double echo(double seconds) {
        return (seconds / 2) * speedOfSoundFPS;
    }
}
