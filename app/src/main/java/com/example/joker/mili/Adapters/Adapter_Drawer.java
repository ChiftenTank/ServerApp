package com.example.joker.mili.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.joker.mili.Classes.Recyclerview_Info;
import com.example.joker.mili.R;
import com.gitonway.lee.niftymodaldialogeffects.lib.Effectstype;
import com.gitonway.lee.niftymodaldialogeffects.lib.NiftyDialogBuilder;

import java.util.List;

/**
 * Created by Joker on 7/20/2020.
 */

public class Adapter_Drawer extends RecyclerView.Adapter<Adapter_Drawer.View_Holder> {

    private Context context;
    private List<Recyclerview_Info> data;
    private LayoutInflater layoutInflater;

    public Adapter_Drawer(Context context, List<Recyclerview_Info> data){

        this.context = context;
        this.data = data;
        layoutInflater=LayoutInflater.from(context);
    }

    @Override
    public View_Holder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view= layoutInflater.inflate(R.layout.recyclerview_nav,parent,false);
        return new View_Holder(view);
    }

    @Override
    public void onBindViewHolder(View_Holder holder, int position) {
        Recyclerview_Info current_rec=data.get(position);
        holder.recycler_nav_txt.setText(current_rec.txt_nav);
        holder.recycler_nav_img.setImageResource(current_rec.img_nav);
    }

    @Override
    public int getItemCount() {

        return data.size();
    }

    public class View_Holder extends RecyclerView.ViewHolder{

        private ImageView recycler_nav_img;
        private TextView recycler_nav_txt;
        private View rippleDrawable;

        public View_Holder(View itemView) {
            super(itemView);
            recycler_nav_img= (ImageView) itemView.findViewById(R.id.img_recycler_nav);
            recycler_nav_txt=(TextView)itemView.findViewById(R.id.txt_recycler_nav);
            rippleDrawable=itemView.findViewById(R.id.mat_ripple);


            rippleDrawable.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int pos=getAdapterPosition();
                    switch (pos){
                        case 0:
                            Toast.makeText(context,"Welcome" , Toast.LENGTH_SHORT).show();
                            break;
                        case 1:
                            final NiftyDialogBuilder nifty=NiftyDialogBuilder.getInstance(context);
                            nifty
                                    .withTitle("Talk to US")
                                    .withDividerColor("#11000000")
                                    .withMessage(context.getString(R.string.info))
                                    .withMessageColor("#FFFFFFFF")
                                    .withDialogColor("#FFE74C3C")
                                    .withIcon(R.drawable.ic_action_contact_mail)
                                    .withDuration(700)
                                    .withEffect(Effectstype.Fall)
                                    .withButton1Text("OK")
                                    .isCancelable(false);
                            nifty.setButton1Click(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    nifty.cancel();
                                }
                            });
                            nifty.show();

                            break;
                        case 2:
                            Toast.makeText(context, "Products", Toast.LENGTH_SHORT).show();
                            break;
                        case 3:
                            Toast.makeText(context, "Setting", Toast.LENGTH_SHORT).show();
                            break;
                        case 4:
                            final NiftyDialogBuilder dialogBuilder=NiftyDialogBuilder.getInstance(context);
                                dialogBuilder
                                .withTitle("Exit")
                                .withDividerColor("#11000000")
                                .withMessage(context.getString(R.string.EXIT))
                                .withMessageColor("#FFFFFFFF")
                                .withDialogColor("#FFE74C3C")
                                .withIcon(R.drawable.ic_action_power_settings_new)
                                .withDuration(700)
                                .withEffect(Effectstype.Fadein)
                                .withButton1Text("OK")
                                .withButton2Text("Cancel")
                                .isCancelable(false);
                            dialogBuilder.setButton1Click(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {

                                    dialogBuilder.getOwnerActivity().finish();

                                }
                            });
                            dialogBuilder.setButton2Click(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    dialogBuilder.cancel();
                                }
                            });
                            dialogBuilder.show();
                            break;

                    }

                }
            });

        }
    }

        }


