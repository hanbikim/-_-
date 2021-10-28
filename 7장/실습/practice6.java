import java.util.*;

class Location{
    private String city;
    private int longitude, latitude;
    public Location(String City, int Longt, int Lati){
        city=City;
        longitude=Longt;
        latitude=Lati;
    }
    public String getCity() {
        return city;
    }
    public int getLatitude() {
        return latitude;
    }
    public int getLongitude() {
        return longitude;
    }
}
public class practice6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Location[] location = new Location[4];
        HashMap<String, Location> hash = new HashMap<String, Location>();
        System.out.println("도시, 경도, 위도를 입력하세요.");

        for(int i=0; i<location.length; i++) {
            System.out.print(">> ");
            String text = scanner.nextLine();

            StringTokenizer str = new StringTokenizer(text, ",");
            String city = str.nextToken().trim();

            int longitude = Integer.parseInt(str.nextToken().trim());
            int latitude = Integer.parseInt(str.nextToken().trim());

            location[i] = new Location(city, longitude, latitude);
            hash.put(city, location[i]);
        }

        System.out.println("----------------------------------");
        Set<String> key=hash.keySet();
        Iterator<String> it=key.iterator();

        while(it.hasNext()) {
            String city = it.next();
            Location L = hash.get(city);
            System.out.println(L.getCity() +" "+L.getLongitude()+" "+L.getLatitude());
        }

        System.out.println("----------------------------------");
        while(true) {
            System.out.print("도시 이름 >> ");
            String city = scanner.next();

            if(city.equals("그만"))
                break;
            Location L = hash.get(city);

            if( L == null)
                System.out.println(city+"는 없습니다.");
            else
                System.out.println(L.getCity() +" "+L.getLongitude()+" "+L.getLatitude());

        }
    }

}
