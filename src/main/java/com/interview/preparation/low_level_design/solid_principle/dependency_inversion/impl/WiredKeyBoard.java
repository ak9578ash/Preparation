package com.interview.preparation.low_level_design.solid_principle.dependency_inversion.impl;

import com.interview.preparation.low_level_design.solid_principle.dependency_inversion.KeyBoard;

public class WiredKeyBoard implements KeyBoard {
    @Override
    public String getKeyBoardType() {
        return "Wired KeyBoard";
    }
}
