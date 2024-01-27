import requests
import streamlit as st
import json


url = 'http://localhost:8080/patient'
#Get
st.title("Get")
response = requests.get(url)
data_list = json.loads(response.text)
st.table(data_list)

#post
st.title("create")
data = {'patientname': 'ram', 'phno': '7234567844'}
headers = {'Content-Type': 'application/json'}
response = requests.post(url, data=json.dumps(data), headers=headers)
data_list = json.loads(response.text)
st.table(data_list)

#put
st.title("update")
data = {'patientname': 'kalees', 'phno': '9234567896'}
patient_id = '354'
update_url = f'{url}/{patient_id}'
headers = {'Content-Type': 'application/json'}
response = requests.put(update_url, data=json.dumps(data), headers=headers)
data_list = json.loads(response.text)
st.table(data_list)

#delete
st.title("delete")
patient_id = '306'
delete_url = f'{url}/{patient_id}'
response = requests.delete(delete_url)
st.text(f"Deleted patient with ID {patient_id}. Status code: {response.status_code}")

