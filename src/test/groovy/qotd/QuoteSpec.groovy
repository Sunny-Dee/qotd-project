package qotd

import grails.test.mixin.TestFor
import spock.lang.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Quote)
class QuoteSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    def "test for valid quote text"() {
        when: 'text is empty'
        def p = new Quote(text: '')
        
        then: 'validate should fail'
        !p.validate()
        
        when: 'text is null' 
        def q = new Quote(text: null)
        
        then: 'validate should fail'
        !q.validate()   
            
        when: 'text is legal'
        def m = new Quote(text: 'Hello')
            
        then: 'test should pass'
        m.validate()
    
    }
}
