package com.webingate.paysmartcustomerapp.activity.customerapp;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.JsonObject;
import com.webingate.paysmartcustomerapp.R;
import com.webingate.paysmartcustomerapp.adapter.customerappFlightBookingAdapter;
import com.webingate.paysmartcustomerapp.adapter.customerappGetalyftBookingAdapter;
import com.webingate.paysmartcustomerapp.customerapp.ApplicationConstants;
import com.webingate.paysmartcustomerapp.customerapp.Deo.CustomerFlightResponce;
import com.webingate.paysmartcustomerapp.customerapp.Deo.GetCustomerBookingListResponse;
import com.webingate.paysmartcustomerapp.customerapp.Dialog.ProgressDialog;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

import static android.content.Context.DOWNLOAD_SERVICE;

public class customerappCurrentBookingListFragment extends Fragment {

    public static final String MyPREFERENCES = "MyPrefs";
    public static final String ID ="idKey";
    public static final String Phone = "phoneKey";
    Toast toast;
    private Context context;
    ListView listView1;
    private String bookingno;
    private String response;

    String mb;
    @BindView(R.id.listView1)
    ListView listView2;


    customerappGetalyftBookingAdapter adapter;
    RecyclerView recyclerView;
    List<GetCustomerBookingListResponse> list;
    ArrayList <GetCustomerBookingListResponse> DrivertripList;
    ProgressDialog dialog ;
    public customerappCurrentBookingListFragment() {

        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view = inflater.inflate(R.layout.customerapp_bookinglist_tabfragment, container, false);
        SharedPreferences prefs = getActivity().getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        ApplicationConstants.mobileNo= prefs.getString(Phone, null);
        initUI(view);
        initData();



        //  initDataBindings();

        initActions();

        return view;
    }


    private void initData() {
        GetCustomercompleteTrips( ApplicationConstants.mobileNo,3);
    }

    private void initUI(View view) {
        adapter=new customerappGetalyftBookingAdapter(null);
        recyclerView =view.findViewById(R.id.RecyclerView);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        //initToolbar();
//             Intent intent=new Intent(getActivity(),driverlistTrips.class);
//             startActivity(intent);
//        viewDetailsTextView1 = view.findViewById(R.id.viewDetailsTextView1);
//        viewDetailsTextView2 = view.findViewById(R.id.viewDetailsTextView2);
//        viewDetailsTextView3 = view.findViewById(R.id.viewDetailsTextView3);
//        viewDetailsTextView4 = view.findViewById(R.id.viewDetailsTextView4);

    }

    private void initDataBinding() {

    }

    private void initActions() {

//        viewDetailsTextView1.setOnClickListener(view -> {
//            //Toast.makeText(getActivity().getApplicationContext(), "Click View Details", Toast.LENGTH_SHORT).show();
//            GoToDetails();
//        });
//
//        viewDetailsTextView2.setOnClickListener(view -> {
//          //  Toast.makeText(getActivity().getApplicationContext(), "Click View Details", Toast.LENGTH_SHORT).show();
//            GoToDetails();
//        });
//
//        viewDetailsTextView3.setOnClickListener(view -> {
//            //Toast.makeText(getActivity().getApplicationContext(), "Click View Details", Toast.LENGTH_SHORT).show();
//            GoToDetails();
//        });
//
//        viewDetailsTextView4.setOnClickListener(view -> {
//            //Toast.makeText(getActivity().getApplicationContext(), "Click View Details", Toast.LENGTH_SHORT).show();
//            GoToDetails();
//        });
    }

    private void displayListView() {


//        //create an ArrayAdaptar from the String Array
//
//        dataAdapter = new MyCustomAdapter(getActivity(),R.layout.layout_tripscustom, DrivertripList);
//
//        // Assign adapter to ListView
//        dataAdapter.notifyDataSetChanged();
//        ListView listView = (ListView) getActivity().findViewById(R.id.listView1);
//        listView.setAdapter(dataAdapter);
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
//            public void onItemClick(AdapterView<?> parent, View view,
//                                    int position, long id) {
//                //dataAdapter.getPosition(GetdriverTripsResponse tripModel);
//
//               // GetdriverTripsResponse tripModel = (GetdriverTripsResponse)list.get(position);
//                bookingno =  dataAdapter.getItem(position).getBNo();
//                //bookingno = tripModel.getId();
//                JsonObject object = new JsonObject();
//                object.addProperty("BNo", bookingno);
//                GetDriverTripsDetails(mb,bookingno);
//                //RideDetails(object);
//
//               /* TripRequest tripRequest = new TripRequest();
//                tripRequest.execute();*/
//            }
//        });

    }

//    private class MyCustomAdapter extends ArrayAdapter<GetCustomerBookingListResponse> {
//
//        private ArrayList<GetCustomerBookingListResponse> logsselected;
//
//        public MyCustomAdapter(Context context, int textViewResourceId,
//                               ArrayList<GetCustomerBookingListResponse> logsSelected) {
//            super(context, textViewResourceId, logsSelected);
//            this.logsselected = DrivertripList;
//            this.logsselected.addAll(logsSelected);
//        }
//
//        private class ViewHolder {
//            TextView time, booking_no, source, destination, price;
//        }
//
//        @Override
//        public View getView(int position, View convertView, ViewGroup parent) {
//
//            ViewHolder holder = null;
//            Log.v("ConvertView", String.valueOf(position));
//
//            if (convertView == null) {
//                //sensorManager = (SensorManager) getActivity().getSystemService(Context.SENSOR_SERVICE);
//                LayoutInflater vi = (LayoutInflater)getActivity().getSystemService(
//                        Context.LAYOUT_INFLATER_SERVICE);
//                convertView = vi.inflate(R.layout.layout_tripscustom, null);
//
//                holder = new ViewHolder();

//                convertView.setTag(holder);
//
//	   /* holder.code.setOnClickListener( new View.OnClickListener() {
//		     public void onClick(View v) {
//		      TextView tb = (TextView) v ;
//		      LogModel log =new LogModel();
//		    		  log= (LogModel) tb.getTag();
//		      Toast.makeText(getApplicationContext(),"Clicked On Log" + log.getName()+" "+log.getDate()+"/"+log.getMonth()+"/"+log.getYear(),
//		      Toast.LENGTH_LONG).show();
//		      //log.setSelected(cb.isChecked());
//		     }
//		    }); */
//            } else {
//                holder = (MyCustomAdapter.ViewHolder) convertView.getTag();
//            }
//
//            GetCustomerBookingListResponse logs = logsselected.get(position);
//            // holder.code.setText(" (" +  logs.getCode() + ")");
//            holder.time.setText(logs.getBookedDate());
//            holder.price.setText("$ " + logs.getAmount());
//            holder.booking_no.setText("Booking No " + logs.getId());
//            holder.source.setText(logs.getSrc());
//
//            holder.destination.setText(logs.getDest());
//            return convertView;
//
//        }
//
//    }

    public void GetCustomercompleteTrips( String customermno, int flag){


        //StartDialogue();
        com.webingate.paysmartcustomerapp.customerapp.Utils.DataPrepare.get(getActivity()).getrestadapter()
                .GetPSVehiclebookingbyStatus(customermno,flag)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<List<GetCustomerBookingListResponse>>() {
                    @Override
                    public void onCompleted() {
                       // DisplayToast("Successfully get Drivers Current Trip list");
                        //   StopDialogue();
                    }
                    @Override
                    public void onError(Throwable e) {
                        try {
                            Log.d("OnError ", e.getMessage());
                            //DisplayToast("Unable to Register");
//                            StopDialogue();
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    }

                    @Override
                    public void onNext(List<GetCustomerBookingListResponse> trips) {
                        DrivertripList= (ArrayList<GetCustomerBookingListResponse>) trips;
                        adapter = new customerappGetalyftBookingAdapter(DrivertripList);
                        recyclerView.setAdapter(adapter);
                        adapter.setOnItemClickListener((view, obj, position) ->
                        {
                            GetDriverTripsDetails(obj.getDriverPhoneNo(),obj.getBNo());
                        });
                    }
                });
    }
    public void DisplayToast(String text){
        if(toast!=null){
            toast.cancel();
            toast=null;

        }
        toast=Toast.makeText(getActivity(),text,Toast.LENGTH_SHORT);
        toast.show();

    }
    public void StartDialogue(){

        dialog.setCanceledOnTouchOutside(false);
        dialog.show();
    }
    public void StopDialogue(){
        if(dialog.isShowing()){
            dialog.cancel();
        }

    }

    public void GetDriverTripsDetails(String driverNo,String bno){

        //StartDialogue();
        com.webingate.paysmartcustomerapp.customerapp.Utils.DataPrepare.get(getActivity()).getrestadapter()
                .Getdrivertripsbookingno(driverNo,bno)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<List<GetCustomerBookingListResponse>>() {
                    @Override
                    public void onCompleted() {
                        DisplayToast("Successfully get Drivers Trip list");
                        //   StopDialogue();
                    }
                    @Override
                    public void onError(Throwable e) {
                        try {
                            Log.d("OnError ", e.getMessage());
                            DisplayToast("Unable to Register");
//                            StopDialogue();
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    }

                    @Override
                    public void onNext(List<GetCustomerBookingListResponse> trips) {
                        GetCustomerBookingListResponse response=trips.get(0);
                        Intent intent = new Intent(getActivity(), customerappBookingDetails.class);
                        intent.putExtra("driverdetails",response.getDriverId());
                        intent.putExtra("comment",response.getComments());
                        intent.putExtra("startTime",response.getBookedDate());
                        intent.putExtra("endTime",response.getDepartureTime());
                        intent.putExtra("source",response.getSrc());
                        intent.putExtra("destination",response.getDest());
                        intent.putExtra("amount",response.getAmount());
                        intent.putExtra("srclat",response.getSrcLatitude());
                        intent.putExtra("srclogt",response.getSrcLongitude());
                        intent.putExtra("destlat",response.getDestLatitude());
                        intent.putExtra("destlogt",response.getDestLongitude());
                        startActivity(intent);
                    }
                });
    }

//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.customerapp_closedtickets_tabfragment, container, false);
//    }

}
