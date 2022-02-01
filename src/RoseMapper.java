public class RoseMapper{
    class Map{
        HashMap<String,T> nodeMap;
        Map(){
            nodeMap=new HashMap();
        }
    }
    class LocationNode{
        ArrayList<LocationNode> connections;
        T location;
        LocationNode(T element){
            this.connections=new ArrayList<LocationNode>();
            this.location=element
        }
    }
}