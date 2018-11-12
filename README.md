
_**Marking alteration in existing code considering below points. 
Would greatly appreciate views and suggestions on approaches I suggest.**_

1. Removed Controller Interface (Its programming paradigm where controller is just a rest resource and
will not be consumed as API similar to service also since controller will not have multiple 
implementations which can switch at runtime)

2. Removed annotation based **cross origin support** and push 
into application.yml to reduce unnecessary verbosity.

3. updated variable names for **naming convention**.

4. Removed **autowiring hardcoded to implementation level**. 
Controller should be autowired on interface level so
when can change implementation class dynamically at runtime as per requirement.
( Using Open/Closed OO programming Principle)

5. Added base rest url in spring properties and changed each controller for smaller more standard urls.
    1. base url will be provided from application.yml
    2. **Rest urls must be nouns not verbs**.
        1. Below resource to understand why its important.
            1. https://hackernoon.com/restful-api-designing-guidelines-the-best-practices-60e1d954e7c9
            2. https://docs.microsoft.com/en-us/azure/architecture/best-practices/api-design
            3. https://www.restapitutorial.com/lessons/restfulresourcenaming.html
            2. https://stackoverflow.com/questions/27121749/confusion-between-noun-vs-verb-in-rest-urls

Please have a look on spotify rest API. It is considered standard HATEOAS compliant REST API to follow.
A good guide line to develop production ready scalable applications.

https://developer.spotify.com/documentation/web-api/reference/library/

6. Need to think through on save project and save all project on HTTP method as well as the way 
to handle request(at service level).
7. Need to expose single API for single as well as multiple project detail save (Point 6).

**Pending:**
1. Jason Validation at controller layer
2. Exception handling at Service layer
3. DB modeling needs to thought through
4. Exception conditions and related error codes yet to decide.