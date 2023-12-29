🔴 Thinking of Integerating 𝕂𝔸𝔽𝕂𝔸 in you 𝗦𝗣𝗥𝗜𝗡𝗚 Project???

 

Believe me it's damn easy.

 

Just follow these highlighted steps and you are good to go:)

 

➡ First & formost you need to have kafka installed in in your system,you may install it locally or via docker(preferably)

 

➡ Once you have kafka installed , here comes second step: add maven dependency of kafka in your pom.xml file of your Spring Project.

 

➡ Now comes third step( aka icebreaker step):

Configuration of Kafka Topic

Configuration of Kafka Producer

Configuration of Kafka Consumer

 

You may configure producer or consumer or both as per your need.

 

➡ Lets further break each of them into further steps:

 

⏩ Cᴏɴꜰɪɢᴜʀᴀᴛɪᴏɴ ᴏꜰ Kᴀꜰᴋᴀ Tᴏᴘɪᴄ:

 

Create bean of kafka topic using Topicbuilder of spring



⏩ Cᴏɴꜰɪɢᴜʀᴀᴛɪᴏɴ ᴏꜰ Kᴀꜰᴋᴀ Pʀᴏᴅᴜᴄᴇʀ:

 

1.Get kafka broker server from your property file,

 then create producer config map passing out kafka broker +serializer(key+value)

 

2.Create producer instance using producer factory

 

3.Then configure KAFKA TEMPLATE so as to send message.

 

⏩ Cᴏɴꜰɪɢᴜʀᴀᴛɪᴏɴ ᴏꜰ Kᴀꜰᴋᴀ Cᴏɴꜱᴜᴍᴇʀ:

 

1.Get kafka broker server from your property file,

 then create consumer config map passing out kafka broker +DEserializer(key+value)

 

2.Create consumer instance using consumer factory

 

3.Then configure KafkaListenerContainerFactory so as to consume message.

 

 

 

➡ ONCE all above configuration is done ,Then remains final step , so as to create a listener for kafka, which listens to every message of kafka.

 

 

➡ Once this is done, you may send message on given topic using kafka template either creating an API endpoint or any other ways.

 

That's all you need to do ❗❗❗❗❗

 

 

Wanna checkout exact code for it??

 

Then here's my github repository for same:

