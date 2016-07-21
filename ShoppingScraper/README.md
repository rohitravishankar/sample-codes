## Web Crawler for Shopping.com

Implemented a robust text scraper that will connect to a page on www.shopping.com, and return a result for a given keyword. Two queries can be performed using this program. The first query is getting the total number of results for a given keyword. The second query is to find all results for a given keywords on a specified page.


### Following are the URLs
    `http://www.shopping.com/products?KW=<keword>`
    `http://www.shopping.com/products~PG-<number>?KW=<keyword>"`

### Queries: 
    Query 1: (requires a single argument)
    `python shop.py <keyword>`
    
    Query 2: (requires two arguments)
    `python shop.py <page number> <keyword>`
