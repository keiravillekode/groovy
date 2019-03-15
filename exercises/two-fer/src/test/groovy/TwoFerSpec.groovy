import spock.lang.Specification

class TwoFerSpec extends Specification {

    def 'No name given'() {
        expect:
        TwoFer.twoFer() == "One for you, one for me."
    }

    @Ignore
    def 'Empty name given'() {
        expect:
        TwoFer.twoFer(name) == expected

        where:
        name | expected
        ""   | "One for you, one for me."
    }

    @Ignore
    def 'Alice given as a name'() {
        expect:
        TwoFer.twoFer(name) == expected

        where:
        name    | expected
        "Alice" | "One for Alice, one for me."
    }

    @Ignore
    def 'Bob given as name'() {
        expect:
        TwoFer.twoFer(name) == expected

        where:
        name  | expected
        "Bob" | "One for Bob, one for me."
    }
}