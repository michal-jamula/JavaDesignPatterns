package structural.composite;

public class CompositeDemo {
    public static void main(String[] args) {
        //This uses stubbed Menu classes to show how the composite pattern works

        Menu mainMenu = new Menu("Main", "/main");
        Menu claimsSubMenu = new Menu("Claims", "/claims");

        MenuItem safetyMenuItem = new MenuItem("Safety", "/safety");
        MenuItem personalClaimsMenu = new MenuItem("Personal Claim", "/personalClaims");

        claimsSubMenu.add(personalClaimsMenu);

        mainMenu.add(safetyMenuItem);
        mainMenu.add(claimsSubMenu);

        //In this cast the claims menu is a Composite (a complex object or container that can have children
        // the All the other menus are leafs (single components which dont have children)

        System.out.println(mainMenu);
    }
}
