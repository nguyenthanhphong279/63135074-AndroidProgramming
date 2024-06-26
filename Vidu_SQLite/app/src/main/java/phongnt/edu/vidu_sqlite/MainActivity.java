package phongnt.edu.vidu_sqlite;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Bước 0. Tạo file cơ sở dữ liệu
        /*
        SQLiteDatabase db = openOrCreateDatabase("QLSach.db", // tên file = tên DB
                MODE_PRIVATE, // giới hạn truy cập
                null          // con trỏ bản ghi
        );
         //B1. Tạo bảng
           //câu lệnh tạo bảng
        String sqlXoaBangNeuDaCo = "DROP TABLE IF EXISTS Books;";

        String sqlTaoBang = "CREATE TABLE Books( BookID integer PRIMARY KEY, " +
                "BookName text, " +
                "Page integer, " +
                "Price Float, " +
                "Description text);";

        // thực hiện lệnh sql
        db.execSQL(sqlXoaBangNeuDaCo);
        db.execSQL(sqlTaoBang);

        // Thêm một số dòng dữ liệu vào bảng
        String sqlThem1 = "INSERT INTO Books VALUES(001, 'Điều kì diệu ở phòng giam số 7', 100, 10.00, 'Sách tình cảm');";
        String sqlThem2 = "INSERT INTO Books VALUES(002, 'Dế mèn phiêu lưu kí', 320, 17.00, 'Sách văn học');";
        String sqlThem3 = "INSERT INTO Books VALUES(003, 'Java', 150, 9.99, 'Sách về Java');";
        String sqlThem4 = "INSERT INTO Books VALUES(004, 'RIDDLE JOKER', 270, 12, 'Sách trinh thám');";
        String sqlThem5 = "INSERT INTO Books VALUES(005, 'Đào đạo bạn gái', 230, 13.99, 'Sách văn học');";
        String sqlThem6 = "INSERT INTO Books VALUES(006, 'FROZEN', 1, 1, 'Truyện thiếu nhi');";
        db.execSQL(sqlThem1);
        db.execSQL(sqlThem2);
        db.execSQL(sqlThem3);
        db.execSQL(sqlThem4);
        db.execSQL(sqlThem5);
        db.execSQL(sqlThem6);

       // Để quan sát trực quan file .db ? ==> Dùng ứng dụng DB Browser for SQLite
       // Để mở được, ta file save file từ điện thoại ra đĩa cứng

       // Ta đóng lại để check

        db.close();
        */

        //TRUY VẤN SELECT
        //B1. Mở CSDL
        SQLiteDatabase db = openOrCreateDatabase("QLSach.db", // tên file = tên DB
                MODE_PRIVATE, // giới hạn truy cập
                null          // con trỏ bản ghi
        );

        //B2. Thực thi câu lệnh select
        String sqlSelect = "Select * from Books;";
        Cursor cs = db.rawQuery(sqlSelect, null);
        cs.moveToFirst(); // đưa con trỏ bản ghi về hàng đầu tiên

        // B3: Đổ vào biến nào đó để xử lý
        // 3.1. Xây dựng model/class cho bảng Books, vi dụ: Book.java
        // 3.2. Tạo biến ArrayList<Book> dsSach;
        dsSach = new ArrayList<Book>();
        //3.3. Duyệt qua lần lượt từng bản ghi và thêm vào danhSach
        while (cs.moveToNext()) // còn bản ghi để chuyển tới
        {
            // Lấy dữ liệu từng côột ở dòng hiện tại
            int idSach = cs.getInt(0);  // lấy dữ liệu ở côt 0, kiểu int
            String tenSach = cs.getString(1);
            int soTrang = cs.getInt(2);
            float gia = cs.getFloat(3);
            String mota = cs.getString(4);
            // Tạo một đối tượng sách và thêm vào danh sách
            Book b = new Book(idSach, tenSach, soTrang, gia, mota);
            dsSach.add(b);
        }
        //B4, Hiện lên listview, recylerview,..
        // để cho nhanh, ở đây thầy chỉ hiện tên sách
        ArrayAdapter<Book> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dsSach);
        listView.setAdapter(adapter);
    }
}