package com.stackroute.optional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FruitUtilTests {

    private static final String MSG_01 = "should return true if fruit exists in the list ignoring case, else should return false. Should return false, when the inputs are null";
    private static final String MSG_02 = "should return the a List of fruit names sorted in descending order";
    private static final String MSG_03 = "should return empty optional when the input list of fruit is empty or null";
    private static final String MSG_04 = "should return null when the inputs are null";
    private static final String MSG_05 = "should return the fruit name for the given fruit ignoring the case";
    private static final String MSG_06 = "should throw an exception named FruitNotFoundException when searched taste does not exist";

    private FruitUtil fruitUtil;
    private List<String> fruitList;
    private List<String> emptyFruitList;
    private Optional<List<String>> sortedFruitList;
    private Map<String, String> fruitTasteMap;

    @BeforeEach
    public void setUp() {
        fruitUtil = new FruitUtil();
        fruitList = List.of("Apple", "Mango", "LITCHI", "ORANGE", "BANANA", "Kiwi", "RASPBERRY", "PLUM");
        emptyFruitList = Collections.emptyList();
        sortedFruitList = Optional.of(List.of("RASPBERRY", "PLUM", "ORANGE", "Mango", "LITCHI", "Kiwi", "BANANA", "Apple"));
        fruitTasteMap = Map.of("Apple", "Sweet", "Kiwi", "Sour");
    }

    @AfterEach
    public void tearDown() {
        fruitUtil = null;
        fruitList = null;
        emptyFruitList = null;
    }

    @Test
    public void givenListOfFruitsWhenSearchFruitPresentThenReturnTrue() {
        assertThat(MSG_01, fruitUtil.searchFruit(fruitList, "Apple"), is(true));
    }

    @Test
    public void givenListOfFruitsWhenSearchFruitNotPresentThenReturnFalse() {
        assertThat(MSG_01, fruitUtil.searchFruit(fruitList, "Strawberry"), is(false));
    }

    @Test
    public void givenListOfFruitsWhenSearchFruitPresentWithNonMatchingCaseThenReturnTrue() {
        assertThat(MSG_01, fruitUtil.searchFruit(fruitList, "APPLE"), is(true));
    }

    @Test
    public void givenListOfFruitsWhenNullOrSearchFruitNullThenReturnFalse() {
        assertThat(MSG_01, fruitUtil.searchFruit(fruitList, null), is(false));
        assertThat(MSG_01, fruitUtil.searchFruit(null, "Apple"), is(false));
    }

    @Test
    public void givenListOfFruitsThenReturnSortedListInDescendingOrder() {
        assertThat(MSG_02, fruitUtil.sortFruits(fruitList), is(sortedFruitList));
    }

    @Test
    public void givenListOfFruitsWhenEmptyThenReturnEmptyOptional() {
        assertThat(MSG_03, fruitUtil.sortFruits(emptyFruitList), is(Optional.empty()));
    }

    @Test
    public void givenListOfFruitsWhenNullThenReturnEmptyOptional() {
        assertThat(MSG_03, fruitUtil.sortFruits(null), is(Optional.empty()));
    }

    @Test
    public void givenMapOfFruitAndTasteWhenNullThenReturnNull() {
        assertThat(MSG_04, fruitUtil.getFruitByTaste(null, "check"), is(nullValue()));
        assertThat(MSG_04, fruitUtil.getFruitByTaste(fruitTasteMap, null), is(nullValue()));

    }

    @Test
    public void givenMapOfFruitAndTasteWhenSearchedByTasteThenReturnFruit() {
        assertThat(MSG_05, fruitUtil.getFruitByTaste(fruitTasteMap, "Sour"), is("Kiwi"));
    }

    @Test
    public void givenMapOfFruitAndTasteWhenSearchedByTasteIgnoringCaseThenReturnFruit() {
        assertThat(MSG_05, fruitUtil.getFruitByTaste(fruitTasteMap, "SWEET"), is("Apple"));
    }

    @Test
    public void givenMapOfFruitAndTasteWhenFruitDoesNotExistThenThrowFruitNotFoundException() {
        assertThrows(FruitNotFoundException.class, () -> fruitUtil.getFruitByTaste(fruitTasteMap, "check"), MSG_06);
    }
}
