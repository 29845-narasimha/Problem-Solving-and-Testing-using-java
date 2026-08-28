class Checker implements Comparator<Player> {

    @Override
    public int compare(Player a, Player b) {
        if (a.score != b.score) {
            return b.score - a.score;   // decreasing score
        }
        return a.name.compareTo(b.name); // alphabetical name
    }
}
