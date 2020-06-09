package com.example.mytherapist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ListU18 extends AppCompatActivity {
    ArrayList<TheList> therapists2 = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_u18);

        final ListView listView2 = findViewById(R.id.lv1);

        TheList maraheb = new TheList("Maraheb Al Qallaf","Emerson College",R.drawable.maraheb,"Maraheb AlQallaf is a speech-language pathologist specializing in identifying and treating children with delayed speech and language, as well as feeding and swallowing disorders. During her studies, she worked in multiple hospitals and speech, language and hearing centers, leading her to develop a special interest in working with school-aged children.", "MarahebAlQallaf@hotmail.com");

        TheList fajer = new TheList("Fajer Almanaie","The University of Miami",R.drawable.fajer,"Fajer earned a master’s degree in Psychology of Applied Behavior Analysis from the University of Miami and is a Board Certified Behavior Analyst (BCBA). Fajer completed her clinical training at the University of Miami’s Intensive Behavioral Intervention Services clinic where she was responsible for conducting individualized programs for children, completing assessments, and conducting ABA trainings.", "FajerAlmanaie@hotmail.com");

        TheList andrea = new TheList("Andrea Al Adwani","University of North Carolina Greensboro",R.drawable.andrea,"Andrea Al Adwani has more than 20 years of experience working with children, teens, and adults from various cultural backgrounds. She earned a Masters from the Regent School of Counseling and Psychology, and a Bachelor of Science in Human Development and Psychology from University of North Carolina Greensboro. She has taught in Universities in the US and Kuwait.", "AndreaAlAdwani@hotmail.com");

        TheList rouba = new TheList("Rouba Khair", "The University of Winchester", R.drawable.rouba, "Rouba completed her Master of Science in Physical Therapy for growth and developmental disorders and its surgery in children in 2010 at Cairo University. Prior to that she has earned a Bachelor of Sciences in Physical Therapy in 2002 from October 6 University in Egypt, from which she graduated with distinction.","RoubaKhair@hotmail.com");

        TheList biby = new TheList("Biby Chahine", "The  Concordia University", R.drawable.biby, "Biby is a graduate from Concordia University holding a Bachelor's degree in Psychology and Child Studies. She believes that the best way to encourage and motivate learning and developmental growth, for people with special needs is by creating and implementing individualized programs.","BibyChahine@hotmail.com");

        TheList farah = new TheList("Farah Abdal", "The  University of Colorado", R.drawable.afrah1, "Farah is a graduate from the University of Colorado Boulder holding a Bachelors degree in Psychology. She is currently working on earning a Masters degree in International Counseling from Lehigh University. Farah has a special interest in providing counseling for adolescents. She also provides early intervention for children with ASD and behavioral problems in both English and Arabic","FarahAbdal@hotmail.com");


        therapists2.add(maraheb);
        therapists2.add(fajer);
        therapists2.add(andrea);
        therapists2.add(rouba);
        therapists2.add(biby);
        therapists2.add(farah);






        ListAdapter adapter2 = new ListAdapter(therapists2,this);
        listView2.setAdapter(adapter2);


       listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i2 = new Intent(ListU18.this, Details2.class);
                i2.putExtra("Therapists", therapists2.get(position));
                startActivity(i2);

            }
        });

    }
}
