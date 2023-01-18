package com.visionlibrary.service;

import com.lowagie.text.*;
import com.lowagie.text.pdf.PdfWriter;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Service
public class PDFGeneratorService {
    public void export(HttpServletResponse response) throws IOException {
        Document document = new Document(PageSize.A4);
        PdfWriter.getInstance(document, response.getOutputStream());

        document.open();
        Font fontTitle = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
        fontTitle.setSize(18);

        Paragraph paragraph = new Paragraph("Meet Me in Istanbul", fontTitle);
        paragraph.setAlignment(Paragraph.ALIGN_CENTER);

        Font fontParagraph = FontFactory.getFont(FontFactory.HELVETICA);
        fontParagraph.setSize(12);

        Paragraph paragraph2 = new Paragraph("Chapter one\n" +
                "Journey to Istanbul\n" +
                "      It is early morning on a sunny spring day in April. Heathrow Airport, London, is busy, as usual.  Hundreds of people are arriving, leaving, or waiting for planes.\n" +
                "\n" +
                "     In the Departure Lounge of Terminal One, a man is sitting reading a newspaper. He does not like airports. There are too many people, and he is always nervous when he flies. He looks at his watch impatiently. Then he hears the announcement over the loudspeakers.\n" +
                "\n" +
                "      ‘British Airways announce the departure of Flight BE570 for Istanbul. Will passengers please proceed to Gate 16 for boarding.’\n" +
                "\n" +
                "      Tom Smith picks up his suitcase and walks towards Gate 16.\n" +
                "\n" +
                "     Twenty minutes later, the plane is preparing to leave. It moves slowly across the airport to runway number two. Tom is sitting looking out of the window.\n" +
                "\n" +
                "      The plane suddenly moves forward, races down the runway and rises into the air. Tom looks down at the houses and roads far below, and smiles. London is behind him. Now he is on his way to Istanbul.\n" +
                "\n" +
                "     Tom relaxed and took a letter from his pocket.\n" +
                "\n" +
                "      Resat  Bey  Apt  11-3, \n" +
                "\n" +
                "Kamerot  Sokak,\n" +
                "\n" +
                " Ayazpasa, Istanbul\n" +
                "\n" +
                "     My dear Tom,\n" +
                "\n" +
                "     Thank you for your letter. I am so happy that you can come and visit me for a holiday. Life here in Istanbul is very interesting.  I am enjoying my work, but I miss you very much. It will be wonderful to see you again.\n" +
                "\n" +
                "    I’m sure we will have a very nice holiday. Spring is here, and the weather is beautiful. I have to work on Monday 14th of April — the day you arrive. So I can’t come to the airport to meet you, but you can take a taxi from the Air Terminal to Taksim Square. That’s in the centre of the new part of the city. There’s a big hotel called the Park Hotel near the square. I’ll meet you there at 5 o’clock. We’ll meet in the American Bar. The view over the city is beautiful.\n" +
                "\n" +
                "     I can’t wait to see you again, Tom. I have so much to tell you. So remember, the Park Hotel, Taksim Square, 5 o’clock.\n" +
                "\n" +
                "See you on the 14th. love,\n" +
                "\n" +
                "Angela.\n" +
                "\n" +
                "     Tom sat for a moment, looking at his fiancee’s letter. Then he put it in his pocket. He looked down at the green fields of France, as the plane continued its journey across Europe.\n" +
                "\n" +
                "     ‘Have you been to Istanbul before?’ said a voice. It was the young man in the next seat.\n" +
                "\n" +
                "    ‘No, I haven’t,’ said Tom. ‘Have you?’\n" +
                "\n" +
                "    The man smiled.\n" +
                "\n" +
                "    ‘My home is in Istanbul. I’m studying in London at the moment. I’m going home for a holiday.’\n" +
                "\n" +
                "    ‘Really?’ said Tom. ‘Where are you studying?’\n" +
                "\n" +
                "    ‘At London University.’\n" +
                "\n" +
                "    The two men sat talking, as the stewardesses began serving lunch. The young man told Tom his name was Kemal. His parents had a shop in Istanbul.\n" +
                "\n" +
                "    ‘Are you meeting someone in Istanbul?’ Kemal asked.\n" +
                "\n" +
                "    ‘My fiancee,’ said Tom. ‘She’s working in Istanbul.’\n" +
                "\n" +
                "    ‘That’s interesting. How long has she been there?’\n" +
                "\n" +
                "    She went to Istanbul two months ago. She works for a small company which is starting to export to England. She’s making all the arrangements.’\n" +
                "\n" +
                "‘Exporting always seems so difficult,’ said Kemal. ‘It seems difficult,’ Tom agreed. ‘But that’s Angela’s job. She’s an expert in importing and exporting. Her father has an import/export agency in London and she has worked for him for some years. She’s almost completed her work in Istanbul now. The company has already started to send goods to England. She’ll be coming back to London soon.’\n" +
                "\n" +
                "     ‘What kind of goods do they export?’ asked Kemal. ‘All kind of things — brass ornaments, coffee-pots, trays leather and onyx articles — Angela’s father thinks these goods will sell very well in England.’\n" +
                "\n" +
                "    ‘That’s interesting,’ said Kemal. ‘My parents sell things like that in their shop in Istanbul.’\n" +
                "\n" +
                "    The two men went on talking as the plane flew over Italy and Greece towards Turkey. Soon they were descending to Yesilkoy Airport, Istanbul.\n" +
                "\n" +
                "    When the plane stopped, Kemal stood up. ‘I hope you enjoy your stay in Istanbul,’ he said.  ‘Here’s my telephone number. If you need anything, phone me. I live in Sisli. It’s not far from the centre of the city.’\n" +
                "\n" +
                "    ‘Thanks, Kemal, that’s very kind of you.’\n" +
                "\n" +
                "    ‘Not at all,’ replied Kemal. ‘Nice to meet you. And now, goodbye.’\n" +
                "\n" +
                "    Tom went through Customs and Immigration and walked towards the airport exit.\n" +
                "\n" +
                "———-\n" +
                "\n" +
                "English Movies for beginners pdf — «Robinson Crusoe» for Beginner Levels\n" +
                "\n" +
                "——-\n" +
                "\n" +
                "Chapter two\n" +
                "The American Bar\n" +
                "     A bus for the City Air Terminal was waiting outside the airport. Tom got in and sat down beside the window. Other passengers got on and the bus left the airport and drove towards Istanbul.\n" +
                "\n" +
                "     Soon they were driving past the houses and apartment blocks near the city.  Then they passed the old city walls. Tom felt excited, and looked at everything. He saw beautiful old mosques and street markets.\n" +
                "\n" +
                "     The bus was now approaching the centre of old Istanbul. It stopped at some traffic lights.\n" +
                "\n" +
                "     A car stopped beside the bus. The door opened and a woman got out. Two men were with her. Suddenly Tom jumped to his feet. It was Angela!\n" +
                "\n" +
                "     ‘Angela!’ Tom shouted. ‘Angela! Here! It’s me, Tom!’\n" +
                "\n" +
                "    He knocked on the bus window. Suddenly the traffic lights changed and the bus moved forward. Tom ran to the back of the bus. Angela and the two men were going into a building.\n" +
                "\n" +
                "     ‘Angela!’ he shouted. ‘An…’ He stopped. It was too late. The bus was moving quickly down a wide street. The passengers were looking at Tom and he suddenly felt foolish. He walked back to his seat and sat down.\n" +
                "\n" +
                "     What a surprise, he thought to himself. I must tell her when I see her this evening. \n" +
                "\n" +
                "    Then the bus crossed Ataturk Bridge and Tom looked at the boats on the Golden Horn. Again he felt excited.\n" +
                "\n" +
                "    The bus arrived at the Air Terminal at a quarter to four.  There were some taxis waiting there. Tom went up to one.\n" +
                "\n" +
                "     ‘The Park Hotel, Taksim Square, please,’ he told the driver.\n" +
                "\n" +
                "    ‘English? You come with me. I take you quickly.’\n" +
                "\n" +
                "    At a quarter past four, the taxi arrived in the square.\n" +
                "\n" +
                "    ‘Here you are, sir, the Park Hotel.’\n" +
                "\n" +
                "    ‘Thank you,’ said Tom, and paid the driver.\n" +
                "\n" +
                "    Tom went into the hotel. He found the American Bar and sat down at a table on the terrace. A waiter came out.\n" +
                "\n" +
                "    ‘A beer, please,’ said Tom.\n" +
                "\n" +
                "    He sat in the afternoon sunshine, and looked down over the city of Istanbul. The view was very beautiful. He was looking at the sea. The Bosphorus was full of ships. There were very big ships going to Russia and little sailing ships. In the distance, he could see the mosques and palaces of old Istanbul. How beautiful and how exciting!\n" +
                "\n" +
                "     Tom looked at his watch. It was nearly five o’clock. He got up and walked up to the hotel entrance. There were lots of people going in and out of the hotel. But he did not see Angela anywhere. He went back to the bar and ordered another beer.\n" +
                "\n" +
                "    Come on Angela, Tom said to himself. Don’t be late.\n" +
                "\n" +
                "     Just inside the American Bar a man in a grey raincoat was sitting at a table. He was drinking coffee and smoking cheap cigarettes. A newspaper lay open on the table in front of him, and from time to time he looked at it. But the man wasn’t reading the newspaper — he was watching Tom.\n" +
                "\n" +
                "     It was now twenty past five. Tom sat in the evening sunshine. He looked at his watch again, and waited. Half past five. Quarter to six. It was getting dark. He looked at the lights on the Bosphorus. Strange, thought Tom. Angela isn’t usually late.\n" +
                "\n" +
                "    Tom sat at the table, on the terrace of the American Bar, waiting for his fiancee.  He waited, and waited, and nobody came.\n" +
                "\n" +
                "    And the man in the grey raincoat sat patiently inside the bar, smoking, and watching Tom.\n" +
                "\n" +
                "     ‘Another beer, sir?’ asked the waiter.\n" +
                "\n" +
                "     ‘No, bring me a black coffee, please. Have you a telephone?’\n" +
                "\n" +
                "     ‘Yes, sir, inside.’\n" +
                "\n" +
                "     Tom went into the hotel. There was a telephone beside the reception. Tom dialled Angela’s number. The phone rang and rang, but nobody answered it. He put the phone down and turned towards the reception desk.\n" +
                "\n" +
                "     ‘Excuse me,’ he asked the receptionist, ‘Kamerot Sokak — do you know where it is?’\n" +
                "\n" +
                "     ‘Yes, it’s very near. Go out of the hotel entrance and turn right. Walk along the street — and Kamerot Sokak is fourth on the right.’\n" +
                "\n" +
                "     ‘Thank you,’ said Tom.\n" +
                "\n" +
                "    Tom went back to the bar. He drank his coffee and paid for his drinks. It was now after eight o’clock. Tom picked up his suitcase and left the hotel.\n" +
                "\n" +
                "     Inside the bar, the man in the grey raincoat stood up and picked up his newspaper.  He put some money on the table and walked out into the street.  He stood on the pavement for a moment or two, then started walking.\n" +
                "\n" +
                "————\n" +
                "\n" +
                "English Movies for beginners pdf — «The Little Prince» for Beginner Levels\n" +
                "\n" +
                "———\n" +
                "\n" +
                "Chapter three\n" +
                "A Shock\n" +
                "     Kamerot Sokak was a narrow, quiet street of old apartment buildings. Tom walked along the pavement, looking at the numbers on the doors. There was only one street light and it was difficult to see. But finally, he found Angela’s address, number 11.\n" +
                "\n" +
                "     The building had a large glass door. Tom pushed it, but it was locked. There was no bell. He knocked on the door.  Nothing happened. He knocked again, louder this time, and listened. Silence.\n" +
                "\n" +
                "    Damn, he thought. He was impatient now. And worried.\n" +
                "\n" +
                "     He stood back in the middle of the street and looked up. There were five floors, and all the windows were black.  There was no light anywhere in the building.\n" +
                "\n" +
                "     Angela, he said to himself, Angela! Where are you?\n" +
                "\n" +
                "     A short distance away, the man in the grey raincoat stood in a dark doorway. He was watching Tom, watching every move he made…\n" +
                "\n" +
                "    Tom did not know what to do. He knocked once more on the glass door — again nothing happened. Finally, he picked up his suitcase. With a last look at the building, he turned and started walking back towards Taksim Square.\n" +
                "\n" +
                "     Tom Smith, he thought to himself, as he walked. You need a hot bath and a good sleep. Then you can decide what to do.\n" +
                "\n" +
                "    The Park Hotel was expensive, but Tom remembered seeing one or two small hotels near Taksim Square. Finally, he was standing outside the Ankara Hotel. He went in.\n" +
                "\n" +
                "    ‘Good evening,’ he said to the woman at reception. ‘I’d like a single room, please.’\n" +
                "\n" +
                "    The woman nodded.\n" +
                "\n" +
                "    ‘We have a nice room upstairs. Come, I’ll show you.’\n" +
                "\n" +
                "    They went upstairs and she opened a door.\n" +
                "\n" +
                "   ‘Very nice room,’ she said.\n" +
                "\n" +
                "    It was small, but it was clean and it looked comfortable.\n" +
                "\n" +
                "    ‘I’ll take it,’ he said, and gave the woman his passport.\n" +
                "\n" +
                "     ‘The bathroom is along the corridor,’ she said. ‘Breakfast is from eight to ten o’clock. Goodnight.’\n" +
                "\n" +
                "     Tom put his case down and sat on the bed. He suddenly felt very tired and unhappy. He was not having a good dinner in a nice restaurant. He was not sitting with the woman he loved. He was sitting alone, in a cheap hotel, in a strange city.\n" +
                "\n" +
                "     For a long time he sat on the bed thinking, But I saw Angela. I saw her from the bus!\n" +
                "\n" +
                "    Finally, he stood up.\n" +
                "\n" +
                "    OK, he thought. Tomorrow morning I’ll go to Angela’s office and find out what has happened. There’s a very simple explanation, I’m sure. I’ll find out tomorrow.\n" +
                "\n" +
                "     He had a hot bath and got into bed. He was very tired after his long journey and soon fell asleep.\n" +
                "\n" +
                "     The man in the grey raincoat walked across Taksim Square. There was a telephone kiosk in the corner.  He dialled a number, and waited. Then he spoke.\n" +
                "\n" +
                "     ‘He’s in the Ankara Hotel,’ the man said. ‘He waited at the Park Hotel and then he went to the girl’s flat. Now he’s in the Ankara Hotel… Yes, yes of course I will.’\n" +
                "\n" +
                "      He put down the phone and left the kiosk.\n" +
                "\n" +
                "     The next morning, Tom felt much better. He had breakfast, then took a taxi to the office where Angela worked.\n" +
                "\n" +
                "     The taxi drove through the busy streets and crossed the Galata Bridge into the old city. Finally, it turned into a small street near the Railway Station. It was a narrow street of shops, small businesses and workshops. The taxi stopped in front of a grey building.\n" +
                "\n" +
                "     «F. Karamian and Co. Export/Import Agency», said the sign above the door. Tom pushed open the door and went in. A secretary was typing at the reception desk. She looked up as Tom came in.\n" +
                "\n" +
                "    ‘Good morning,’ she smiled.\n" +
                "\n" +
                "   ‘Good morning,’ said Tom. ‘My name’s Tom Smith. I’m looking for Angela Thomson — she’s my fiancee. I arrived in Istanbul last night and waited for her, but she didn’t…’     \n" +
                "\n" +
                "     The secretary was staring at him. She stood up.\n" +
                "\n" +
                "     ‘Wait a moment, please, Mr Smith.’\n" +
                "\n" +
                "    She hurried over to a door marked «Office», and went inside. Tom could hear her talking to someone.\n" +
                "\n" +
                "    The door opened and a man came out. He looked very serious.\n" +
                "\n" +
                "    ‘Mr Smith, my name’s Diinya. Please come in.’\n" +
                "\n" +
                "    Tom went into the office.\n" +
                "\n" +
                "    ‘Please sit down, Mr Smith,’ said Diinya. ‘Look — er, I don’t know how to tell you this, Mr Smith. I have some very bad news for you. I’m very sorry indeed, but Miss Thomson, your fiancee — is — is dead.’\n" +
                "\n" +
                "———\n" +
                "\n" +
                "English Movies for beginners pdf — «Rich Man, Poor Man» for Beginners Levels\n" +
                "\n" +
                "——-\n" +
                "\n" +
                "Chapter four\n" +
                "‘I Saw Her’\n" +
                "    Drink this, Mr Smith,’ said Mr Diinya. He handed Tom a glass of strong brandy. Tom sat, shocked, white-faced, unable to speak. He drank the brandy slowly.\n" +
                "\n" +
                "    ‘How — how did it happen?’ he asked.\n" +
                "\n" +
                "    ‘A car accident. Miss Thomson was driving along a dangerous road. No one knows what happened. Her car went off the road and fell down the hillside.’\n" +
                "\n" +
                "    ‘Yesterday evening?’ Tom asked.\n" +
                "\n" +
                "    ‘I beg your pardon?’\n" +
                "\n" +
                "    ‘The accident — it happened yesterday evening?’\n" +
                "\n" +
                "    Diinya looked at him.\n" +
                "\n" +
                "   ‘Mr Smith, the accident happened a week ago — last Sunday to be exact. She had been away to Bursa for the weekend and…’\n" +
                "\n" +
                "    ‘But that’s impossible!’ said Tom. ‘I saw Angela yesterday!’\n" +
                "\n" +
                "    ‘Yesterday?’\n" +
                "\n" +
                "    ‘Yes. I was on the airport bus, coming into Istanbul. I saw her in the street.’\n" +
                "\n" +
                "    ‘I’m terribly sorry, Mr Smith, but you’re making a mistake.’ \n" +
                "\n" +
                "    ‘No, I tell you I saw her. I…’\n" +
                "\n" +
                "    ‘Mr Smith,’ Diinya said patiently, ‘Istanbul is a big city. There must be hundreds of women here who look like your fiancee.’\n" +
                "\n" +
                "    Tom said nothing.\n" +
                "\n" +
                "    ‘The British Consulate were very helpful,’ continued Mr Diinya. ‘They made all the arrangements for the funeral. It was on Wednesday.’\n" +
                "\n" +
                "    ‘Have her parents been told about this?’ Tom asked.\n" +
                "\n" +
                "    ‘That is a problem, I’m afraid. Her parents are on holiday in France. The British and French police are trying to contact them.’    \n" +
                "\n" +
                "    ‘So they don’t know yet,’ said Tom quietly.\n" +
                "\n" +
                "    ‘No, they don’t, I’m afraid.’\n" +
                "\n" +
                "    There was a long silence.\n" +
                "\n" +
                "    ‘Can I have another brandy, please?’ asked Tom.   \n" +
                "\n" +
                "   ‘Of course.’\n" +
                "\n" +
                "    Tom tried hard to think clearly.\n" +
                "\n" +
                "    ‘I thought I saw her yesterday,’ he said softly.\n" +
                "\n" +
                "    ‘I understand, Mr Smith. It’s a great shock — a terrible tragedy for you — for all of us.’\n" +
                "\n" +
                "    After a pause, Diinya asked, ‘What will you do now, Mr Smith? Is there anything I can do to help?’\n" +
                "\n" +
                "    ‘I’m not sure,’ said Tom. ‘I need some time to think. I don’t know what to do.’\n" +
                "\n" +
                "    ‘Do you know anyone in Istanbul?’\n" +
                "\n" +
                "    Suddenly Tom remembered Kemal.\n" +
                "\n" +
                "   ‘Yes, yes, I have friends, don’t worry. Look, Mr Diinya, I can’t decide anything now. I think I’ll stay in Istanbul for a day or two. I’d like to visit the Consulate, and maybe the police.’\n" +
                "\n" +
                "    Mr Diinya opened a drawer in his desk and took out a card. He wrote on it and handed the card to Tom.\n" +
                "\n" +
                "     ‘I’ve written down the telephone number of Mr David Pennington.  He’s the man in the Consulate who made the arrrangements for the funeral. The other number is my office telephone number. Contact me if you need anything.  I’m here during the day.’\n" +
                "\n" +
                "    Tom stood up.\n" +
                "\n" +
                "    ‘I must go now,’ he said. ‘Thank you, you’ve been most kind.’ \n" +
                "\n" +
                "    Mr Diinya walked with him to the door. ‘Well, Mr Smith, once again, I’m terribly sorry.’  \n" +
                "\n" +
                "    ‘You know I was so sure I saw her. So sure…’ Tom said. \n" +
                "\n" +
                "    ‘I understand,’ replied Diinya. ‘It’s a terrible shock.’\n" +
                "\n" +
                "    The two men shook hands.\n" +
                "\n" +
                "    ‘Remember, come here any time if you need anything,’ said Mr Diinya. ‘Goodbye, now.’\n" +
                "\n" +
                "   ‘Goodbye,’ said Tom, and walked out into the street.\n" +
                "\n" +
                "   Mr Diinya turned and walked back into his office. He closed the door carefully and sat down at his desk. For a few minutes he sat thinking. Then he picked up the telephone.     \n" +
                "\n" +
                "    Tom walked slowly through the crowded streets of old Istanbul.  The streets were busy, and full of interesting people, shops and cafes. But Tom did not see any of those things. He was not interested in Istanbul, he was not a tourist any more. Tom was thinking of Angela. He remembered the journey on the bus from the airport. He was sure he had seen Angela. She had been there on the pavement, getting out of a car.  But Diinya said it was not Angela.  Angela was dead. She had died a week ago.\n" +
                "\n" +
                "    Tom walked through the streets of the city. He walked through the Grand Bazaar.  He walked on and on through narrow old streets. He didn’t know where he was, or what time it was. He thought about Angela. He thought again about his journey on the bus from the airport. Again and again he thought about it, and again and again he saw his fiancee. Then he stopped walking, and stood for a moment on the pavement. He was standing on a street beside the sea.\n" +
                "\n" +
                "     Angela isn’t dead, he thought. I saw her!\n" +
                "\n" +
                "    He looked in his pocket and found Kemal’s telephone number. He walked quickly across the street to a cafe. He went inside to the telephone.    \n" +
                "\n" +
                "    ‘Hello, Kemal? Hello, it’s me, Tom. Remember…? Yes, yes, fine thanks.  Listen, remember you said I could phone you if I needed anything?  Well, something has happened. Can we meet somewhere?’\n" +
                "\n" +
                "———\n" +
                "\n" +
                "English Movies for beginners pdf — «South for the Winter» for Beginners\n" +
                "\n" +
                "———\n" +
                "\n" +
                "Chapter five\n" +
                "A Disappointing Day\n" +
                "     ‘So,’ said Kemal, ‘you really think you saw her, do you?’\n" +
                "\n" +
                "     Kemal and Tom were sitting in the American Bar at the Park Hotel. Tom thought carefully for a moment before answering.\n" +
                "\n" +
                "    ‘Yes,’ he said slowly. ‘Yes, I do. You probably think I imagined it. I understand that. But I’m convinced I saw her, that’s all.’\n" +
                "\n" +
                "     Kemal nodded.\n" +
                "\n" +
                "     ‘I can’t stop thinking about yesterday,’ Tom continued.  ‘I close my eyes and I can see Angela there on the pavement.  I can’t forget that.’ \n" +
                "\n" +
                "    ‘Listen, Tom,’ said Kemal. ‘We only met yesterday but already we’re friends.  You’re in my country, you’re my friend, and you need help. If you think you saw Angela, that’s enough for me. I believe you. Now we have to decide what to do.’\n" +
                "\n" +
                "     ‘There are two things I want to do as soon as possible,’ said Tom. ‘I want to go to the street where I saw Angela. Then I want to go to the British Consulate. I have an appointment for this afternoon.’\n" +
                "\n" +
                "     ‘OK,’ said Kemal. ‘The street where you saw Angela. Do you think you can remember where it is?’\n" +
                "\n" +
                "    ‘No problem,’ said Tom. ‘We can drive along the same route as the airport bus. I’m sure I’ll remember it.’\n" +
                "\n" +
                "    ‘And what do you think you will find there?’\n" +
                "\n" +
                "    ‘I’m not sure. But she was going into a building with two men. At least we can find the building — maybe that will tell us something.’\n" +
                "\n" +
                "     ‘OK,’ said Kemal. ‘My car’s outside. Let’s go.’\n" +
                "\n" +
                "    Tom and Kemal were driving through the city.\n" +
                "\n" +
                "    ‘It was a wide street,’ said Tom. ‘We came to a roundabout after the traffic lights. We turned left and then we passed an old aqueduct.’\n" +
                "\n" +
                "     ‘Aksaray,’ said Kemal. ‘It’s near here.’\n" +
                "\n" +
                "      Kemal drove over Ataturk Bridge. After a few minutes, they saw the old aqueduct.  Then they came to a large roundabout and turned right.\n" +
                "\n" +
                "     ‘This is it,’ said Tom. ‘It’s somewhere near here.’\n" +
                "\n" +
                "     They were approaching some traffic lights. Tom looked out of the window at the buildings on the left.  \n" +
                "\n" +
                "     ‘No,’ he said. ‘Not here.’\n" +
                "\n" +
                "     They drove on to the next traffic lights.\n" +
                "\n" +
                "      ‘This is it,’ said Tom. ‘This is the place.’\n" +
                "\n" +
                "      Kemal stopped the car.\n" +
                "\n" +
                "      ‘You get out. I’ll find a parking place.’\n" +
                "\n" +
                "      Tom got out and looked around him. He was in a wide street of shops and offices.  A newspaper kiosk, a travel agency — he remembered them from the day before. He stood looking at the buildings opposite until Kemal arrived.\n" +
                "\n" +
                "      Tom pointed across the street to the entrance to an office building.\n" +
                "\n" +
                "     ‘That’s it, I think,’ he said.\n" +
                "\n" +
                "     They crossed the street and looked at the name plate beside the entrance to the office block. There were many names there a lawyer, a dentist, a doctor, and many other offices. Tom stood looking at the names for a few moments.\n" +
                "\n" +
                "      ‘Well,’ he said finally, ‘I’m sure she went into this building. But which office was she going to? Was she going to see a lawyer, or a dentist, or a doctor? How do we begin to find out?’\n" +
                "\n" +
                "     Kemal took his arm gently, and they walked slowly back to the car.\n" +
                "\n" +
                "     ‘Listen, Tom,’ he said. ‘You’re going too fast. You can’t expect to find out everything immediately. Wait until you see the man at the Consulate. After that, we’ll think about it.  Then we can decide what to do. We know she was going into that building. That’s something, anyway. Now look, it’s lunch-time. You must be hungry. I know a good restaurant near here …’\n" +
                "\n" +
                "     ‘You’re right,’ said Tom. ‘We have to be patient.’\n" +
                "\n" +
                "——\n" +
                "\n" +
                "English Movies for beginners pdf — «Blue Moon Beach» — for Beginners\n" +
                "\n" +
                "——\n" +
                "\n" +
                "Chapter six\n" +
                "Visit to the Consulate\n" +
                "      After lunch, Kemal drove Tom to the British Consulate in Mesrutiyet Street. He stopped the car at the gate.\n" +
                "\n" +
                "     ‘Well, good luck,’ he said. ‘I’ll wait for you.’\n" +
                "\n" +
                "      Tom opened the car door.\n" +
                "\n" +
                "      ‘It’s very good of you to help me like this Kemal.  Thanks very much.’\n" +
                "\n" +
                "     ‘Not at all,’ said Kemal. ‘See you later.’\n" +
                "\n" +
                "     Tom went through the Consulate gates. The old Consulate, with beautiful gardens round it, looked like a palace. Tom pushed the big door open and went in.\n" +
                "\n" +
                "     ‘I’d like to see Mr David Pennington, please,’ he said at the reception desk.  ‘My name’s Tom Smith. I have an appointment.’\n" +
                "\n" +
                "      After a few minutes, a tall man wearing glasses came to meet him.\n" +
                "\n" +
                "      ‘Mr Smith, my name’s Pennington.  How do you do?’  said the man, holding out his hand.\n" +
                "\n" +
                "     Tom shook Mr Pennington’s hand. ‘How do you do,’ he replied.\n" +
                "\n" +
                "     ‘Come into my office, please, Mr.  Smith.  Mr  Diinya told me you were coming.’\n" +
                "\n" +
                "      They walked up the beautiful staircase of the Consulate and went into Mr Pennington’s office.\n" +
                "\n" +
                "     ‘Sit down, please,’ said Pennington. ‘Mr Smith, I’m very sorry about your fiancee.  It was a great tragedy.  Please accept my condolences.’\n" +
                "\n" +
                "     ‘Thank you,’ said Tom.\n" +
                "\n" +
                "      Mr Pennington took two files from his desk.\n" +
                "\n" +
                "     ‘This is our report on the accident,’ he said. ‘And this is the police report. I can give you copies of these, but perhaps you’d like to ask me some questions first.’\n" +
                "\n" +
                "     Tom thought for a moment.\n" +
                "\n" +
                "     ‘Mr. Pennington,’ he said, ‘I think I saw Angela yesterday.’\n" +
                "\n" +
                "      Pennington stared at Tom.  There was silence in the room. Pennington looked down at his desk, then he looked at Tom again. Tom was able to hear the noise of the traffic in the street outside the gardens. For a long time Pennington said nothing. At last he spoke.\n" +
                "\n" +
                "     ‘Mr. Smith,’ he said, ‘I don’t think you fully understand.  Your fiancee…’\n" +
                "\n" +
                "     ‘I know,’ Tom interrupted. ‘Angela was killed in a road accident last weekend. Her funeral was last Wednesday. Mr  Diinya told me that this morning. But I’m telling you I saw her yesterday.’\n" +
                "\n" +
                "      ‘Mr.  Smith, I think you should read these reports carefully before you say anything more.’\n" +
                "\n" +
                "       He passed the files over to Tom.\n" +
                "\n" +
                "      ‘Can I get you a cup of tea or something?’\n" +
                "\n" +
                "      ‘A cup of tea would be nice. Thank you.’\n" +
                "\n" +
                "      Pennington left the office. He came back a few minutes later with some tea.  There was silence in the room while Tom read the reports. Presently he looked up.\n" +
                "\n" +
                "     ‘After the accident,’ Tom asked Pennington, ‘how did they identify the body?’\n" +
                "\n" +
                "     ‘That was difficult,’ said Pennington. ‘As you know, the accident happened on a dangerous road about 200 kilometres from here. Your fiancee’s car crashed through a wall by the side of the road, and fell down the hillside. The car burst into flames and was completely burned out. The — the body was very badly burned, so identification was difficult. But the police found your fiancee’s handbag lying near the car. Her passport and papers were in the handbag. The police found out that the car was owned by a car hire company.  Miss Thomson had hired the car for the weekend.’\n" +
                "\n" +
                "     ‘What about Angela’s parents?’ Tom asked.\n" +
                "\n" +
                "     ‘I’m afraid her parents don’t know about the accident yet. They’re on a camping holiday in France — the police are trying to contact them.’\n" +
                "\n" +
                "      ‘What was she doing on that dangerous road?’\n" +
                "\n" +
                "      ‘She spent the weekend in Bursa, sightseeing. It’s a very interesting old town. She was on her way back to Istanbul.’\n" +
                "\n" +
                "      Tom thought for a moment.\n" +
                "\n" +
                "      ‘And are the police quite satisfied?’ Tom asked.\n" +
                "\n" +
                "     ‘Yes,’ said Pennington. ‘The police are convinced that it was an accident. The file is closed.’\n" +
                "\n" +
                "      ‘And you people at the Consulate,’ said Tom quietly, ‘are you satisfied?’\n" +
                "\n" +
                "      For a moment Pennington said nothing.\n" +
                "\n" +
                "      ‘Yes, Mr Smith, we are,’ he said. ‘Our job, among other things, is to look after British citizens in Turkey. We have looked into this matter very carefully. And we are satisfied that it was an accident.’\n" +
                "\n" +
                "     Tom said nothing.\n" +
                "\n" +
                "     ‘I really am very sorry,’ Pennington went on.  ‘I understand how you must feel. You’ve had a terrible shock.  My advice to you now is to leave Istanbul. There is nothing you can do here.’\n" +
                "\n" +
                "     ‘I’m beginning to think you’re right,’ said Tom. ‘Perhaps I should go home. You know, I really thought I saw Angela, but now…’\n" +
                "\n" +
                "     ‘Where are you staying?’ asked Pennington.\n" +
                "\n" +
                "      ‘The Ankara Hotel, near Taksim Square.’\n" +
                "\n" +
                "      ‘Will you be all right? Do you know anyone here?’\n" +
                "\n" +
                "      ‘I’m all right, thank you. I have a friend here.’\n" +
                "\n" +
                "     ‘Well Mr Smith, please think carefully about what I’ve said. I hope you’ll take my advice. If you need anything before you leave, contact me. I’ll be glad to help you.’\n" +
                "\n" +
                "      ‘Thank you,’ said Tom, standing up. ‘Thank you for all you’ve done.’\n" +
                "\n" +
                "     ‘Not at all,’ said Pennington. ‘I’m sorry your visit to Istanbul wasn’t a happier one. Have a good journey home.  Goodbye.’\n" +
                "\n" +
                "     The two men shook hands and Tom left the Consulate.\n" +
                "\n" +
                "——\n" +
                "\n" +
                "English Movies for beginners pdf — 10 Very Funny Short Stories for Beginner Levels\n" +
                "\n" +
                "——-\n" +
                "\n" +
                "Chapter seven\n" +
                "The Man in the Grey Raincoat\n" +
                "      Kemal was waiting in the car outside the Consulate gates.\n" +
                "\n" +
                "       ‘What did he say?’ Kemal asked, as Tom got in the car.\n" +
                "\n" +
                "      ‘The same as Diinya,’ Tom replied. ‘It was an accident.  Angela’s dead. The file is closed.’\n" +
                "\n" +
                "      Kemal started the car, and drove away from the Consulate.\n" +
                "\n" +
                "      ‘Mr.  Pennington advised me to go back to London,’ Tom continued. ‘I’m beginning to think he’s right.’\n" +
                "\n" +
                "      Kemal said nothing.\n" +
                "\n" +
                "     ‘The police think Angela is dead, and the people at the Consulate do too.  I’m the only person who doesn’t think she’s dead. So what am I going to do? Stay here in Istanbul? Go home? Really, I just don’t…’\n" +
                "\n" +
                "        ‘Now wait a minute, wait a minute, Tom,’ said Kemal. ‘How long have you been in Istanbul?’\n" +
                "\n" +
                "      ‘Not very long…’  \n" +
                "\n" +
                "      ‘You’ve been here less than twenty-four hours.  And what has happened to you in this time? You’ve had a terrible shock. You’ve been told that your fiancee was killed in an accident a week ago. But you are sure you saw her from the bus last night. So now you are confused and you don’t know what to do. That’s right, isn’t it?’\n" +
                "\n" +
                "      Tom nodded his head slowly in agreement.\n" +
                "\n" +
                "     ‘Well, I’ll tell you what you’re going to do,’ Kemal went on. ‘You’re going to come with me to the Topkapi Palace. We can walk through the beautiful gardens there and think about everything carefully. Then we can decide what to do next.’\n" +
                "\n" +
                "     Tom smiled.\n" +
                "\n" +
                "     ‘You’re right, of course. It has been a difficult day.’\n" +
                "\n" +
                "     ‘Exactly,’ said Kemal. ‘Now it’s time to relax a little.’\n" +
                "\n" +
                "      They were driving down narrow streets, to the Golden\n" +
                "\n" +
                "Horn.\n" +
                "\n" +
                "      ‘This is the Galata Bridge — it crosses the Golden Horn,’ said Kemal. ‘Look, isn’t it beautiful?’\n" +
                "\n" +
                "     They drove slowly across the bridge in the bright sunlight.\n" +
                "\n" +
                "     ‘It is beautiful,’ said Tom, looking out across the Bosphorus. ‘Very beautiful.’ \n" +
                "\n" +
                "     They continued across the bridge, turned left, and drove past the Railway Station.  A few minutes later they came to Santa Sophia — one of the oldest and most beautiful buildings in Istanbul. It was once a church, then a mosque and now it is a museum.\n" +
                "\n" +
                "      ‘We’ll leave the car here,’ said Kemal. ‘First, I’m going to show you the Palace of Topkapi.’\n" +
                "\n" +
                "      They got out of the car in a large park. They were standing in front of the first gate of the Palace.\n" +
                "\n" +
                "      ‘The Sultans of Turkey used to live in Topkapi Palace,’ Kemal explained.\n" +
                "\n" +
                "     Kemal and Tom bought an entrance ticket.  They walked through the gate into the gardens of the Palace.\n" +
                "\n" +
                "     ‘This is the first courtyard of the Palace,’ went on Kemal. ‘Over there are the royal kitchens. And over there the harem — that’s part of the Palace where the women lived.’\n" +
                "\n" +
                "       They were walking down a wide path. Kemal looked round and then he took Tom by the arm.\n" +
                "\n" +
                "     ‘Walk a little faster,’ he said quietly.\n" +
                "\n" +
                "     Tom saw that there was a strange look on Kemal’s face.\n" +
                "\n" +
                "     ‘Is anything wrong?’ he asked. \n" +
                "\n" +
                "      ‘Keep walking,’ said Kemal. ‘And don’t look back.’\n" +
                "\n" +
                "     They walked across the courtyard towards the second gate of the Palace.\n" +
                "\n" +
                "      ‘Kemal, what’s wrong?’ said Tom quickly.\n" +
                "\n" +
                "     ‘Someone is following us,’ answered Kemal.\n" +
                "\n" +
                "     Someone following us?’ said Tom. ‘What do you mean?’ \n" +
                "\n" +
                "      There’s a man in a grey raincoat walking behind us. I saw him when we came into the Palace. I wasn’t sure at first, but I’m sure now.’\n" +
                "\n" +
                "      They walked on and then ran through the second gateway. Kemal looked back.  The man was still following them.\n" +
                "\n" +
                "‘This way. Quickly.’ Kemal led Tom to the entrance of the Treasury. Inside, it was very crowded and it was also dark after the bright sunshine.\n" +
                "\n" +
                "      ‘We’re going to separate now,’ said Kemal. ‘The man won’t be able to follow both of us. You take a taxi back to your hotel. Have you got some money?’\n" +
                "\n" +
                "     ‘Yes,’ said Tom.\n" +
                "\n" +
                "     ‘Right, I’ll phone you this evening.’  \n" +
                "\n" +
                "     ‘What are you going to do?’ asked Tom.\n" +
                "\n" +
                "     ‘I’m going back to my car.’\n" +
                "\n" +
                "     ‘Be careful,’ said Tom.\n" +
                "\n" +
                "    ‘You too,’ said Kemal. ‘See you later.’", fontParagraph);
        paragraph2.setAlignment(Paragraph.ALIGN_LEFT);

        document.add(paragraph);
        document.add(paragraph2);
        document.close();
    }
}