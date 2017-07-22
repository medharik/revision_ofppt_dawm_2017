protected void sendSMSMessage() {
        Log.i("Envoie  SMS", "");
        double latitude = mGps.getLatitude();
        double longitude = mGps.getLongitude();

        Geocoder geocoder = new Geocoder(this, Locale.getDefault());
        String nomMenu = editTextNomMenu.getText().toString();//recupere le nom du menu depuis un editText
        String codeClient = editTextcodeClient.getText().toString();//recupere le codeClient pour l'identier
        
        String message = "Mon code Client : "+ codeclient+"\nje veux  commander le menu suivant : "+nomMenu+"\nVoici mes coordonnées GPS:-" + latitude + ", "
                + longitude+ ;

        try {
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(nomMenu, null, message, null, null);
            Toast.makeText(
                    getApplicationContext(),
                    "SMS envoyé contenant la latitude et la longitude en cours",
                    Toast.LENGTH_LONG).show();
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(),
                    "erreur d'envoie du sms.", Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
     