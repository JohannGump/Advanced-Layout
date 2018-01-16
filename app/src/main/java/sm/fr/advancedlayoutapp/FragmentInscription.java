package sm.fr.advancedlayoutapp;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentInscription extends Fragment {

    DrawerActivity parentActivity;
    EditText userNameEditText;

    //private android.app.Fragment myself = this;

    public FragmentInscription() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_fragment_inscription, container, false);

        // récupération d'une référence au champs du formulaire
        userNameEditText = view.findViewById(R.id.EditTextUserName);
        String userName = userNameEditText.getText().toString();

        //Récupération d'une référence à l'activité
        parentActivity = (DrawerActivity) getActivity();

        //Gestion du clic sur le bouton valider
        Button btValid = view.findViewById(R.id.btValidateInscription);
        btValid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Récupération de la saisie de l'utilisateur
                String userName = userNameEditText.getText().toString();
                //Récupération de l'entité utilisateur et modification du nom de l'utilisateur
                parentActivity.getUser().setUserName(userName);

                //Navigation vers le Fragment B en passant par l'activité parent
                parentActivity.goToFragmentB();
            }
        });

        return view;

    }

}





