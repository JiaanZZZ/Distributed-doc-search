## Building Distributed Document Search

### Description:

- Build an entire distributed system - Distributed Search
- User inputs search query and most relevant documents to the user's search will be displayed.
- Formalize the search algotithm (Term Frequency - Invese Document Frequency Algorithm)


### Architecture:
- The search term and number of documents are the factors that affect the output of TFIDF algorithm. 
In order to parallelize the algorithm, documents should be distributed among nodes 
since length of terms can be limited to a certain length but the number of documents will always grow.
The calculated results from each node will be sent to the leader node to aggregate the result.
- Zookeepers act as a node coordinator 
  - Coordinators Service Registry 
  - Workders Service Registry 
- Implement worker nodes 
- Implement search coordinator

