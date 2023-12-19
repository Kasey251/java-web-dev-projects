package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(org.launchcode.BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void onlyOpenBracketReturnsFalse() {
        assertFalse(org.launchcode.BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void onlyCloseBracketReturnsFalse() {
        assertFalse(org.launchcode.BalancedBrackets.hasBalancedBrackets("]"));
    }
    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(org.launchcode.BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void bracketLaunchcodeReturnsTrue() {
        assertTrue(org.launchcode.BalancedBrackets.hasBalancedBrackets("[Launchcode]"));
    }
    @Test
    public void onlyOpenLaunchcodeReturnsFalse() {
        assertFalse(org.launchcode.BalancedBrackets.hasBalancedBrackets("[Launchcode"));
    }
    @Test
    public void onlyCloseLaunchcodeReturnsFalse() {
        assertFalse(org.launchcode.BalancedBrackets.hasBalancedBrackets("Launchcode]"));
    }
    @Test
    public void onlyLaunchcodeReturnsTrue() {
        assertTrue(org.launchcode.BalancedBrackets.hasBalancedBrackets("Launchcode"));
    }
    @Test
    public void launchOpenCodeReturnsFalse() {
        assertFalse(org.launchcode.BalancedBrackets.hasBalancedBrackets("Launch[code"));
    }
    @Test
    public void launchOpenCodeCloseReturnsTrue() {
        assertTrue(org.launchcode.BalancedBrackets.hasBalancedBrackets("Launch[code]"));
    }
    @Test
    public void launchCloseCodeReturnsFalse() {
        assertFalse(org.launchcode.BalancedBrackets.hasBalancedBrackets("Launch]code"));
    }
    @Test
    public void openLaunchCloseCodeReturnsFalse() {
        assertTrue(org.launchcode.BalancedBrackets.hasBalancedBrackets("[Launch]code"));
    }
}