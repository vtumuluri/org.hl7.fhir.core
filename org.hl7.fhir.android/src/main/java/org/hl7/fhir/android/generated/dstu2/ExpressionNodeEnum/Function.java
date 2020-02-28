package org.hl7.fhir.android.generated.dstu2.ExpressionNodeEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum Function {

    Custom,
    Empty,
    Not,
    Exists,
    SubsetOf,
    SupersetOf,
    IsDistinct,
    Distinct,
    Count,
    Where,
    Select,
    All,
    Repeat,
    Item,
    /*implicit from name[]*/
    As,
    Is,
    Single,
    First,
    Last,
    Tail,
    Skip,
    Take,
    Iif,
    ToInteger,
    ToDecimal,
    ToString,
    Substring,
    StartsWith,
    EndsWith,
    Matches,
    ReplaceMatches,
    Contains,
    Replace,
    Length,
    Children,
    Descendants,
    MemberOf,
    Trace,
    Today,
    Now,
    Resolve,
    Extension;

    public static Function fromCode(String name) {
        if (name.equals("empty"))
            return Function.Empty;
        if (name.equals("not"))
            return Function.Not;
        if (name.equals("exists"))
            return Function.Exists;
        if (name.equals("subsetOf"))
            return Function.SubsetOf;
        if (name.equals("supersetOf"))
            return Function.SupersetOf;
        if (name.equals("isDistinct"))
            return Function.IsDistinct;
        if (name.equals("distinct"))
            return Function.Distinct;
        if (name.equals("count"))
            return Function.Count;
        if (name.equals("where"))
            return Function.Where;
        if (name.equals("select"))
            return Function.Select;
        if (name.equals("all"))
            return Function.All;
        if (name.equals("repeat"))
            return Function.Repeat;
        if (name.equals("item"))
            return Function.Item;
        if (name.equals("as"))
            return Function.As;
        if (name.equals("is"))
            return Function.Is;
        if (name.equals("single"))
            return Function.Single;
        if (name.equals("first"))
            return Function.First;
        if (name.equals("last"))
            return Function.Last;
        if (name.equals("tail"))
            return Function.Tail;
        if (name.equals("skip"))
            return Function.Skip;
        if (name.equals("take"))
            return Function.Take;
        if (name.equals("iif"))
            return Function.Iif;
        if (name.equals("toInteger"))
            return Function.ToInteger;
        if (name.equals("toDecimal"))
            return Function.ToDecimal;
        if (name.equals("toString"))
            return Function.ToString;
        if (name.equals("substring"))
            return Function.Substring;
        if (name.equals("startsWith"))
            return Function.StartsWith;
        if (name.equals("endsWith"))
            return Function.EndsWith;
        if (name.equals("matches"))
            return Function.Matches;
        if (name.equals("replaceMatches"))
            return Function.ReplaceMatches;
        if (name.equals("contains"))
            return Function.Contains;
        if (name.equals("replace"))
            return Function.Replace;
        if (name.equals("length"))
            return Function.Length;
        if (name.equals("children"))
            return Function.Children;
        if (name.equals("descendants"))
            return Function.Descendants;
        if (name.equals("memberOf"))
            return Function.MemberOf;
        if (name.equals("trace"))
            return Function.Trace;
        if (name.equals("today"))
            return Function.Today;
        if (name.equals("now"))
            return Function.Now;
        if (name.equals("resolve"))
            return Function.Resolve;
        if (name.equals("extension"))
            return Function.Extension;
        return null;
    }

    public String toCode() {
        switch(this) {
            case Empty:
                return "empty";
            case Not:
                return "not";
            case Exists:
                return "exists";
            case SubsetOf:
                return "subsetOf";
            case SupersetOf:
                return "supersetOf";
            case IsDistinct:
                return "isDistinct";
            case Distinct:
                return "distinct";
            case Count:
                return "count";
            case Where:
                return "where";
            case Select:
                return "select";
            case All:
                return "all";
            case Repeat:
                return "repeat";
            case Item:
                return "item";
            case As:
                return "as";
            case Is:
                return "is";
            case Single:
                return "single";
            case First:
                return "first";
            case Last:
                return "last";
            case Tail:
                return "tail";
            case Skip:
                return "skip";
            case Take:
                return "take";
            case Iif:
                return "iif";
            case ToInteger:
                return "toInteger";
            case ToDecimal:
                return "toDecimal";
            case ToString:
                return "toString";
            case Substring:
                return "substring";
            case StartsWith:
                return "startsWith";
            case EndsWith:
                return "endsWith";
            case Matches:
                return "matches";
            case ReplaceMatches:
                return "replaceMatches";
            case Contains:
                return "contains";
            case Replace:
                return "replace";
            case Length:
                return "length";
            case Children:
                return "children";
            case Descendants:
                return "descendants";
            case MemberOf:
                return "memberOf";
            case Trace:
                return "trace";
            case Today:
                return "today";
            case Now:
                return "now";
            case Resolve:
                return "resolve";
            case Extension:
                return "extension";
            default:
                return "??";
        }
    }
}
