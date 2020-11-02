import java.util.Base64;

public class Base64Test {
    public static void main(String[] args) {
        String base64String = "Vk4sQlRKLEJUSjAwMSwzMDQxODQzMTIwLDEwMDAsMjAyMC0xMC0wNywsMSxNRVVDSVFDWmZXU2ZUaktTVE5OT0NEcjdrMmU5WUd6Vk02OE5uVVdvdHIwT0tlZlZkQUlnVTVRd0hSd2hZWWJtYUtEK0dEbkprS21abkV6Qnk0M29POUdoUHpaWUMvYz0sTUVVQ0lRREliQW5VbTNLKy9qYTlHYkpMUXRITExNNU5yRW5FajY1Wjd1MXlZTkFuT1FJZ0FUVVNHUm56b1RyWGl5MDJ0cGx4bDVvTk5vL3JWbEZycTZFaFFEWUZablE9";
        byte[] arr = Base64.getDecoder().decode(base64String);
        String[] newArr = new String(arr).split(",");
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(i+" "+ newArr[i]);
        }
    }
}

