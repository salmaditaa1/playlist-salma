public class Playlist {

        private Song head;

        public Playlist() {
            head = null;
        }


        public void addSong(String title) {
            Song newSong = new Song(title);

            if (head == null) {
                head = newSong;
            } else {
                Song current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newSong;
            }
        }

        public void displayPlaylist() {
            if (head == null) {
                System.out.println("Playlist kosong.");
                return;
            }

            Song current = head;
            System.out.println("Daftar Lagu:");
            while (current != null) {
                System.out.println("- " + current.title);
                current = current.next;
            }
        }
    }

