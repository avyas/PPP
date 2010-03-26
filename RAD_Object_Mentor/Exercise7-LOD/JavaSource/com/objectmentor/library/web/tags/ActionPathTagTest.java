package com.objectmentor.library.web.tags;

import com.objectmentor.library.mocks.MockJspWriter;
import com.objectmentor.library.mocks.MockPageContext;

import junit.framework.TestCase;

public class ActionPathTagTest extends TestCase {

  public void testShouldPrependLibraryAndAppendDotDo() throws Exception {
    MockJspWriter out = new MockJspWriter(0, false);
    MockPageContext pageContext = new MockPageContext(out);
    ActionPathTag tag = new ActionPathTag();
    tag.setPageContext(pageContext);
    tag.setActionName("a/b");
    tag.doStartTag();
    assertEquals("/Library/a/b.do", out.submittedContent);
  }
}
