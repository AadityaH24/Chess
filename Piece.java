public class Piece {
        
        public String name;
        public String color;
        public int position_x, position_y;
        public Piece(String name, String color, int position_x, int position_y) {
            this.name = name;
            this.color = color;
            this.position_x = position_x;
            this.position_y = position_y;
        }
        public String getName() {
            return name;
        }
        public String getColor() {
            return color;
        }
        public int getPosition_x() {
            return position_x;
        }
        public int getPosition_y() {
            return position_y;
        }

        public boolean moveLegality(int new_x, int new_y) {
            if (new_x + position_x< 0 || new_x + position_x > 7 || new_y + position_y < 0 || new_y + position_y > 7) {
                return false;
            }
            if(new_x == position_x && new_y == position_y) {
                return false;
            }
            if(this.name == "Queen"){
                if(new_x == position_x || new_y == position_y) {
                    return true;
                }
                else if(Math.abs(new_x - position_x) == Math.abs(new_y - position_y)) {
                    return true;
                }
                else {
                    return false;
                }
            }
            else if(this.name == "Rook"){
                if(new_x == position_x || new_y == position_y) {
                    return true;
                }
                else {
                    return false;
                }
            }
            else if(this.name == "Bishop"){
                if(Math.abs(new_x - position_x) == Math.abs(new_y - position_y)) {
                    return true;
                }
                else {
                    return false;
                }
            }
            else if(this.name == "Knight"){
                if(Math.abs(new_x - position_x) == 2 && Math.abs(new_y - position_y) == 1 || Math.abs(new_x - position_x) == 1 && Math.abs(new_y - position_y) == 2) {
                    return true;
                }
                else {
                    return false;
                }
            }
            else if(this.name == "Pawn"){
                if(new_x == position_x && new_y == position_y + 1) {
                    return true;
                }
                else if(new_x == position_x && new_y == position_y - 1) {
                    return true;
                }
                else if(new_x == position_x + 1 && new_y == position_y + 1) {
                    return true;
                }
                else if(new_x == position_x + 1 && new_y == position_y - 1) {
                    return true;
                }
                else if(new_x == position_x - 1 && new_y == position_y + 1) {
                    return true;
                }
                else if(new_x == position_x - 1 && new_y == position_y - 1) {
                    return true;
                }
                else {
                    return false;
                }
            }
            else{
                return false;
            }
        }
        
}
