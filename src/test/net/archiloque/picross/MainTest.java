package net.archiloque.picross;

import org.testng.annotations.Test;

/**
 * © Julien Kirch 2013 - Licensed under MIT license
 */
public class MainTest {


    @Test
    public void something() {
        Main.main(
                new String[]{
                        "7,3,2,6;7,3,3,2,6;7,3,3,6;5,2,9;5,6,9;5,6,12;6,12;5,3,11;5,3,3,8;5,3,3,1,5,2;5,2,5,2;9,2,6,2;12,1,1;12,3,1,3;8,3,1,3;4,3,2,2;4,3,5,2;4,3,5,1,3,3;3,1,5,1,3,2;2,1,5,1,2;4,1,4,4,2;4,3,9;6,3,14;4,2,14;4,2,14",
                        "6,7,5;6,7,4,5;6,7,4,5;6,7,4,5;6,7,3,1;3,3,2,1,1;3,6,7,1,1;6,7,2;3,6,9,3;3,3,3,3;3,3,3,3,4;3,3,3,5,3;2,2,1,5,3;3,2,2,1,5,3;3,5,1,5,3;4,2,3;2,6,1,3,8;2,9,3,5;9,2,5;15,3,5;12,3,4;12,2,4;8,3,1,4;8,3,3,8;8,3,8"
        });
    }
}
