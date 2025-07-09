public class pojoex {
    public static void main(String[] args) {
        JOwner j = new JOwner();
        j.setGold(50);
        System.out.println(j.getGold());
    }
}

class JOwner {
    private int gold;

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
}
