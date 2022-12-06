# CSC-420-Assignment-2
This homework requires you to do custom painting on a component, as well as use the correct layouts and/or other structures for the correct arrangement of components.

Build a Java Swing application that allows a user to specify the color and position of a circle on a canvas, then draw it.

Your application's main area should be taken by a canvas where you will eventually draw the circle. Use two JSliders, one horizontal under the canvas, and one vertical on the left side of the canvas, for allowing the user to specify the position of the circle. Under the horizontal slider put a single-selection component (e.g., a drop-down list like you did in HW1), and next to it a button. The single-selection component should allow the user to select one out of several possible colors for the circle (e.g., "navy blue," "yellow," "brick red," etc.)

The button should have the label "Show." When the button is clicked, your application should take the positions of the sliders and the selected color from the single-selection component, and draw a small circle at the specified position with the specified color.

As soon as the circle is drawn, the button's label should change to "Hide." When the user clicks the button again, the circle is hidden (drawn over with background color -- you can repaint the entire canvas). When that happens, the button's label changes back to "Show," and the process can be repeated.

Submit your sources and resources to the Blackboard dropbox before the deadline.

I'll want you to demonstrate how your homework works after you submit it, too.

All Swing homeworks are individual. Group work is not permitted.
