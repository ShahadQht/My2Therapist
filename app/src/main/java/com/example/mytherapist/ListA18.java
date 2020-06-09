package com.example.mytherapist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

public class ListA18 extends AppCompatActivity {

    ArrayList<TheList> therapists = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_a18);

        final ListView listView = findViewById(R.id.lv);

        TheList nicholas = new TheList("Dr. Nicholas Scull","University of Wisconsin",R.drawable.nicholas,"Dr. Nicholas Scull is licensed in the United States, as both a psychologist and clinical social worker. He has many years of clinical experience working across a range of different settings and institutions, including the University of California, Los Angeles (UCLA), the University of Wisconsin-Madison, Swarthmore College, as well as a number public schools and community mental health centers. He has specialized training in providing culturally competent psychotherapy, clinical supervision, and psychoeducational assessment.", "NicholasScull@hotmail.com");

        TheList saliha = new TheList("Dr. Saliha Kozan","Selcuk University",R.drawable.saliha,"Dr. Saliha Kozan is licensed in California, United States as a psychologist. She has worked with individuals of all ages with a wide range of psychological concerns. Dr. Saliha uses a holistic, strength-based approach to facilitate positive change and growth through psychological assessment and psychotherapy. She integrates a social justice perspective into all aspects of her work, and she is passionate about promoting mental health in ethnically, culturally, and economically diverse communities.","SalihaKozan@hotmail.com");

        TheList huda = new TheList("Dr. Huda Shaaban","Lebanese University",R.drawable.huda,"Dr. Huda Shaaban is a highly trained learning disabilities expert, with more than 22 years of professional experience in the field, where she has largely focused on the area of educational psychology. Dr. Huda has been working in the educational field in Kuwait since 1996, serving in multiple professional capacities including high school instructor, educational specialist and consultant, researcher, lecturer and school director. ","HudaShaaban@hotmail.com");

        TheList kurt = new TheList("Kurt Dixon","University of Western Cape",R.drawable.kurt,"Kurt Dixon is a licensed clinical psychologist from South Africa who is experienced in working with adults and adolescents. Kurt works psycho-dynamically which is a form of insight orientated therapy to assist clients with symptom reduction, develop self-awareness and more resilient ways of functioning. He also has extensive experience in skills based interventions such as Dialectical Behavior Therapy (DBT), group therapy and alternative methods such as Mindfulness Stress Reduction.","KurtDixon@hotmail.com");

        TheList j = new TheList("Jennifer Hoang","Dickinson College",R.drawable.jennifer,"Jennifer Hoang is a certified counselor through the state of New York who specializes in social/emotional counseling with school-aged children (pre-k thru grade 12) and college counseling. Jennifer adapts various therapeutic approaches catering to the individual needs of her clients including Person Centered Therapy and Cognitive-Behavioral Therapy (CBT). She also utilizes reflective therapeutic processes when conducting college counseling with adolescent clients to work towards self-discovery and pursuit of higher education.","JenniferHoang@hotmail.com");

        TheList k = new TheList("Kim Dixon", "University of Stellenbosch",R.drawable.kim,"Kim Dixon is a licensed clinical psychologist with extensive experience in the education sector; including serving in teaching and counseling roles, planning and implementing integrated life skills programs, developing individual educational plans, as well as offering guidance and support to a range of students of differing educational abilities.","KimDixon@hotmail.com");

        therapists.add(nicholas);
        therapists.add(saliha);
        therapists.add(huda);
        therapists.add(kurt);
        therapists.add(j);
        therapists.add(k);




        ListAdapter adapter = new ListAdapter(therapists,this);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(ListA18.this, Details2.class);
                i.putExtra("Therapists", therapists.get(position));
                startActivity(i);

            }
        });
    }
}
