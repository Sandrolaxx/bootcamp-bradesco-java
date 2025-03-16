package desafiosoduku.util;

import desafiosoduku.model.Element;

public final class BoardTemplate {

    private BoardTemplate() {
    }

    public final static String BOARD_TEMPLATE = """
            *************************************************************************************
            *|-------||-------||-------|*|-------||-------||-------|*|-------||-------||-------|*
            *|       ||       ||       |*|       ||       ||       |*|       ||       ||       |*
            *|  %s   ||  %s   ||  %s   |*|  %s   ||  %s   ||  %s   |*|  %s   ||  %s   ||  %s   |*
            *|       ||       ||       |*|       ||       ||       |*|       ||       ||       |*
            *|-------||-------||-------|*|-------||-------||-------|*|-------||-------||-------|*
            *|-------||-------||-------|*|-------||-------||-------|*|-------||-------||-------|*
            *|       ||       ||       |*|       ||       ||       |*|       ||       ||       |*
            *|  %s   ||  %s   ||  %s   |*|  %s   ||  %s   ||  %s   |*|  %s   ||  %s   ||  %s   |*
            *|       ||       ||       |*|       ||       ||       |*|       ||       ||       |*
            *|-------||-------||-------|*|-------||-------||-------|*|-------||-------||-------|*
            *|-------||-------||-------|*|-------||-------||-------|*|-------||-------||-------|*
            *|       ||       ||       |*|       ||       ||       |*|       ||       ||       |*
            *|  %s   ||  %s   ||  %s   |*|  %s   ||  %s   ||  %s   |*|  %s   ||  %s   ||  %s   |*
            *|       ||       ||       |*|       ||       ||       |*|       ||       ||       |*
            *|-------||-------||-------|*|-------||-------||-------|*|-------||-------||-------|*
            *************************************************************************************
            *|-------||-------||-------|*|-------||-------||-------|*|-------||-------||-------|*
            *|       ||       ||       |*|       ||       ||       |*|       ||       ||       |*
            *|  %s   ||  %s   ||  %s   |*|  %s   ||  %s   ||  %s   |*|  %s   ||  %s   ||  %s   |*
            *|       ||       ||       |*|       ||       ||       |*|       ||       ||       |*
            *|-------||-------||-------|*|-------||-------||-------|*|-------||-------||-------|*
            *|-------||-------||-------|*|-------||-------||-------|*|-------||-------||-------|*
            *|       ||       ||       |*|       ||       ||       |*|       ||       ||       |*
            *|  %s   ||  %s   ||  %s   |*|  %s   ||  %s   ||  %s   |*|  %s   ||  %s   ||  %s   |*
            *|       ||       ||       |*|       ||       ||       |*|       ||       ||       |*
            *|-------||-------||-------|*|-------||-------||-------|*|-------||-------||-------|*
            *|-------||-------||-------|*|-------||-------||-------|*|-------||-------||-------|*
            *|       ||       ||       |*|       ||       ||       |*|       ||       ||       |*
            *|  %s   ||  %s   ||  %s   |*|  %s   ||  %s   ||  %s   |*|  %s   ||  %s   ||  %s   |*
            *|       ||       ||       |*|       ||       ||       |*|       ||       ||       |*
            *|-------||-------||-------|*|-------||-------||-------|*|-------||-------||-------|*
            *************************************************************************************
            *|-------||-------||-------|*|-------||-------||-------|*|-------||-------||-------|*
            *|       ||       ||       |*|       ||       ||       |*|       ||       ||       |*
            *|  %s   ||  %s   ||  %s   |*|  %s   ||  %s   ||  %s   |*|  %s   ||  %s   ||  %s   |*
            *|       ||       ||       |*|       ||       ||       |*|       ||       ||       |*
            *|-------||-------||-------|*|-------||-------||-------|*|-------||-------||-------|*
            *|-------||-------||-------|*|-------||-------||-------|*|-------||-------||-------|*
            *|       ||       ||       |*|       ||       ||       |*|       ||       ||       |*
            *|  %s   ||  %s   ||  %s   |*|  %s   ||  %s   ||  %s   |*|  %s   ||  %s   ||  %s   |*
            *|       ||       ||       |*|       ||       ||       |*|       ||       ||       |*
            *|-------||-------||-------|*|-------||-------||-------|*|-------||-------||-------|*
            *|-------||-------||-------|*|-------||-------||-------|*|-------||-------||-------|*
            *|       ||       ||       |*|       ||       ||       |*|       ||       ||       |*
            *|  %s   ||  %s   ||  %s   |*|  %s   ||  %s   ||  %s   |*|  %s   ||  %s   ||  %s   |*
            *|       ||       ||       |*|       ||       ||       |*|       ||       ||       |*
            *|-------||-------||-------|*|-------||-------||-------|*|-------||-------||-------|*
            *************************************************************************************
            """;

    public static Element[] GAME_CONFIG = {
            new Element(0, 0, 4, false), new Element(1, 0, 7, false), new Element(2, 0, 9, true),
            new Element(3, 0, 5, false), new Element(4, 0, 8, true), new Element(5, 0, 6, true),
            new Element(6, 0, 2, true), new Element(7, 0, 3, false), new Element(8, 0, 1, false),
            new Element(0, 1, 1, false), new Element(1, 1, 3, true), new Element(2, 1, 5, false),
            new Element(3, 1, 4, false), new Element(4, 1, 7, true), new Element(5, 1, 2, false),
            new Element(6, 1, 8, false), new Element(7, 1, 9, true), new Element(8, 1, 6, true),
            new Element(0, 2, 2, false), new Element(1, 2, 6, true), new Element(2, 2, 8, false),
            new Element(3, 2, 9, false), new Element(4, 2, 1, true), new Element(5, 2, 3, false),
            new Element(6, 2, 7, false), new Element(7, 2, 4, false), new Element(8, 2, 5, true),
            new Element(0, 3, 5, true), new Element(1, 3, 1, false), new Element(2, 3, 3, true),
            new Element(3, 3, 7, false), new Element(4, 3, 6, false), new Element(5, 3, 4, false),
            new Element(6, 3, 9, false), new Element(7, 3, 8, true), new Element(8, 3, 2, false),
            new Element(0, 4, 8, false), new Element(1, 4, 9, true), new Element(2, 4, 7, false),
            new Element(3, 4, 1, true), new Element(4, 4, 2, true), new Element(5, 4, 5, true),
            new Element(6, 4, 3, false), new Element(7, 4, 6, true), new Element(8, 4, 4, false),
            new Element(0, 5, 6, false), new Element(1, 5, 4, true), new Element(2, 5, 2, false),
            new Element(3, 5, 3, false), new Element(4, 5, 9, false), new Element(5, 5, 8, false),
            new Element(6, 5, 1, true), new Element(7, 5, 5, false), new Element(8, 5, 7, true),
            new Element(0, 6, 7, true), new Element(1, 6, 5, false), new Element(2, 6, 4, false),
            new Element(3, 6, 2, false), new Element(4, 6, 3, true), new Element(5, 6, 9, false),
            new Element(6, 6, 6, false), new Element(7, 6, 1, true), new Element(8, 6, 8, false),
            new Element(0, 7, 9, true), new Element(1, 7, 8, true), new Element(2, 7, 1, false),
            new Element(3, 7, 6, false), new Element(4, 7, 4, true), new Element(5, 7, 7, false),
            new Element(6, 7, 5, false), new Element(7, 7, 2, true), new Element(8, 7, 3, false),
            new Element(0, 8, 3, false), new Element(1, 8, 2, false), new Element(2, 8, 6, true),
            new Element(3, 8, 8, true), new Element(4, 8, 5, true), new Element(5, 8, 1, false),
            new Element(6, 8, 4, true), new Element(7, 8, 7, false), new Element(8, 8, 9, false)
    };

}
