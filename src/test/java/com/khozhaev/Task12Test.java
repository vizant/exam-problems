package com.khozhaev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Task12Test {

    private static final Task12 TASK_12 = new Task12();

    @ParameterizedTest
    @MethodSource("cyclicInputData")
    void whenListHasCycle_thanReturnTrue(Task12.ListNode head) {
        Assertions.assertTrue(TASK_12.hasCycle(head));
    }

    private static Stream<Arguments> cyclicInputData() {
        Task12.ListNode node1 = new Task12.ListNode();
        node1.value = 1;
        Task12.ListNode node2 = new Task12.ListNode();
        node2.value = 2;
        node1.next = node2;
        Task12.ListNode node3 = new Task12.ListNode();
        node3.value = 3;
        node2.next = node3;
        Task12.ListNode node4 = new Task12.ListNode();
        node3.next = node4;
        node4.value = 4;
        node4.next = node1;

        return Stream.of(
                Arguments.of(node1)
        );
    }

    @ParameterizedTest
    @MethodSource("notCyclicInputData")
    void whenListDoesNotHaveCycle_thanReturnFalse(Task12.ListNode head) {
        Assertions.assertFalse(TASK_12.hasCycle(head));
    }

    private static Stream<Arguments> notCyclicInputData() {
        Task12.ListNode node1 = new Task12.ListNode();
        node1.value = 1;
        Task12.ListNode node2 = new Task12.ListNode();
        node2.value = 2;
        node1.next = node2;
        Task12.ListNode node3 = new Task12.ListNode();
        node3.value = 3;
        node2.next = node3;
        Task12.ListNode node4 = new Task12.ListNode();
        node3.next = node4;
        node4.value = 4;
        node4.next = null;

        return Stream.of(
                Arguments.of(node1)
        );
    }
}