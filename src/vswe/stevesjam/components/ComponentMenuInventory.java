package vswe.stevesjam.components;


import vswe.stevesjam.interfaces.GuiJam;

public class ComponentMenuInventory extends ComponentMenu {
    public ComponentMenuInventory(FlowComponent parent) {
        super(parent);
    }

    @Override
    public String getName() {
        return "Inventory";
    }

    @Override
    public void draw(GuiJam gui, int renderX, int renderY, int mX, int mY) {

    }

    @Override
    public void drawText(GuiJam gui, int renderX, int renderY) {
        gui.drawString("This is an inventory thingy", renderX + 5, renderY + 10, 0xFF00FF);
    }
}