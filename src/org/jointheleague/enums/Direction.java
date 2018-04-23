package org.jointheleague.enums;

public enum Direction {

    NORTH(-1, 0), EAST(0, 1), SOUTH (1, 0), WEST(0, -1);

    private final int deltaRow;
    private final int deltaColumn;

    Direction(int rowDelta, int columnDelta) {
        this.deltaRow = rowDelta;
        this.deltaColumn = columnDelta;
    }

    public int getDeltaRow() {
        return deltaRow;
    }

    public int getDeltaCol() {
        return deltaColumn;
    }

    public Direction getRight() {
        return Direction.values()[(ordinal() + 1) % 4];
    }

    public Direction getLeft() {
        return Direction.values()[(ordinal() + 3) % 4];
    }

    // Optional: Create an app that shows a maze on a rectangular grid, and traces a "robot"
    // that moves like a right wall hugger.

}
