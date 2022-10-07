
// 错误理解题意：以为是订会议室，一个事件要连续占用一个会议室，不可以更换会议室。
// 实际上，是可以换会议室的，一个event事件的时间是可以拆分的，比如【24，33】可以拆成【14，27】和【27，33】

// ["MyCalendarThree","book","book","book","book","book","book","book","book","book","book","book","book","book","book","book","book","book","book","book","book","book","book","book","book","book","book","book","book","book","book"]
// [[],[47,50],[1,10],[27,36],[40,47],[20,27],[15,23],[10,18],[27,36],[17,25],[8,17],[24,33],[23,28],[21,27],[47,50],[14,21],[26,32],[16,21],[2,7],[24,33],[6,13],[44,50],[33,39],[30,36],[6,15],[21,27],[49,50],[38,45],[4,12],[46,50],[13,21]]

class MyCalendarThree {
    public int height;
    public ArrayList<Floor> lib;
    
    public class Floor{
        public ArrayList<Ocu> fl;
        
        public Floor() {
            fl = new ArrayList<Ocu>();
        }
        
        public Floor(Ocu ocu) {
            fl = new ArrayList<Ocu>();
            fl.add(ocu);
        }
    }
    
    public class Ocu {
        int st;
        int en;
        
        public Ocu(int start, int end) {
            st = start;
            en = end;
        }
        
    }
    
    public MyCalendarThree() {
        lib = new ArrayList<Floor>();
        height = 0;
    }
    
    public int book(int start, int end) {
        if (height == 0) {
            Ocu aocu = new Ocu(start, end);
            Floor afl = new Floor();
            afl.fl.add(aocu);
            this.lib.add(afl);
            this.height += 1;
            return height;
        }
        boolean move2nextFloor = false;
        boolean booked = false;
        for (Floor fl : this.lib) {
            move2nextFloor = false;
            for (Ocu ocu : fl.fl) {
                if (!(ocu.en <= start || end <= ocu.st)) {
                    move2nextFloor = true;
                    break;
                }
                
            }
            if (move2nextFloor) continue;
            else {
                Ocu cocu = new Ocu(start, end);
                fl.fl.add(cocu);
                booked = true;
                return height;
            }
        }
        if (!booked) {
            Ocu bocu = new Ocu(start, end);
            Floor bfl = new Floor(bocu);
            this.lib.add(bfl);
            this.height += 1;
            booked = true;
            return height;
        }
        return height;
    }
    
    
}

/**
 * Your MyCalendarThree object will be instantiated and called as such:
 * MyCalendarThree obj = new MyCalendarThree();
 * int param_1 = obj.book(start,end);
 */